/**
 * Copyright 2007-2016, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.service.echo;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

import org.agrona.DirectBuffer;
import org.agrona.concurrent.IdleStrategy;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.concurrent.YieldingIdleStrategy;
import org.kaazing.gateway.transport.IoHandlerAdapter;
import org.kaazing.gateway.transport.LoggingUtils;
import org.kaazing.mina.core.buffer.IoBufferEx;
import org.kaazing.mina.core.buffer.SimpleBufferAllocator;
import org.kaazing.mina.core.session.IoSessionEx;
import org.slf4j.Logger;

import io.aeron.Aeron;
import io.aeron.ConcurrentPublication;
import io.aeron.FragmentAssembler;
import io.aeron.Subscription;
import io.aeron.logbuffer.FragmentHandler;
import io.aeron.logbuffer.Header;

class EchoServiceHandler extends IoHandlerAdapter<IoSessionEx> {
    private final IdleStrategy idleStrategy = new YieldingIdleStrategy();
    private final Logger logger;

    private final Aeron aeron;
    // Not a good pattern - just to prove integration works
    private final AtomicReference<IoSessionEx> lastSession = new AtomicReference<>();
    private final ConcurrentPublication publication;
    private final UnsafeBuffer publicationBuffer;

    EchoServiceHandler(Logger logger) {
        this.logger = logger;
        aeron = Aeron.connect();
        publication = aeron.addPublication("aeron:ipc", 1);
        publicationBuffer = new UnsafeBuffer(new byte[1024 * 64]);
        new Thread(this::subscribeToResponses).start();
    }

    private void subscribeToResponses() {
        Subscription subscription = aeron.addSubscription("aeron:ipc", 2);
        FragmentHandler handler = new FragmentAssembler(this::onResponse);
        while (true) {
            int workDone = subscription.poll(handler, 10);
            if (workDone <= 0) {
                idleStrategy.idle();
            }
        }
    }

    private void onResponse(DirectBuffer buffer, int offset, int length, Header header) {
        IoSessionEx session = lastSession.get();
        if (session == null) {
            return;
        }
        byte[] copy = new byte[length];
        buffer.getBytes(offset, copy);
        IoBufferEx message = SimpleBufferAllocator.BUFFER_ALLOCATOR.wrap(copy);
        session.write(message);
    }

    @Override
    protected void doMessageReceived(final IoSessionEx session, Object message) throws Exception {
        lastSession.set(session);
        if (message instanceof IoBufferEx) {
            final IoBufferEx buf = (IoBufferEx) message;
            final byte[] copy = buf.array();
            publicationBuffer.putBytes(0, copy);
            // Ignore failures
            long bytesSent = publication.offer(publicationBuffer, 0, copy.length);
            logger.debug("Published {} bytes", bytesSent);
        }
    }

    @Override
    protected void doExceptionCaught(IoSessionEx session, Throwable cause) throws Exception {
        LoggingUtils.log(session, logger, cause);
    }
}
