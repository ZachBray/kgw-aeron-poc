package com.weareadaptive.aeron.demo;

import java.util.concurrent.atomic.AtomicBoolean;

import org.agrona.DirectBuffer;
import org.agrona.concurrent.IdleStrategy;
import org.agrona.concurrent.SigInt;
import org.agrona.concurrent.YieldingIdleStrategy;

import io.aeron.Aeron;
import io.aeron.ExclusivePublication;
import io.aeron.FragmentAssembler;
import io.aeron.Subscription;
import io.aeron.driver.MediaDriver;
import io.aeron.driver.exceptions.ActiveDriverException;
import io.aeron.logbuffer.FragmentHandler;
import io.aeron.logbuffer.Header;

public class EchoServer {
    private final IdleStrategy idleStrategy = new YieldingIdleStrategy();
    private ExclusivePublication publication;
    private MediaDriver driver;

    public void start() {
        try {
            driver = MediaDriver.launch();
        } catch (ActiveDriverException e) {
            // Ignore
        }
        Aeron aeron = Aeron.connect();
        Subscription subscription = aeron.addSubscription("aeron:ipc", 1);
        publication = aeron.addExclusivePublication("aeron:ipc", 2);
        FragmentHandler handler = new FragmentAssembler(this::onMessage);
        AtomicBoolean hasStopped = new AtomicBoolean(false);
        SigInt.register(() -> hasStopped.set(true));
        System.out.println("Started");
        while (!hasStopped.get()) {
            int workDone = subscription.poll(handler, 10);
            if (workDone <= 0) {
                idleStrategy.idle();
            }
        }
        System.out.println("Stopped");
    }

    private void onMessage(DirectBuffer buffer, int offset, int length, Header header) {
        System.out.println("Received message");
        // Ignores failures
        long resultCode = publication.offer(buffer, offset, length);
        if (resultCode > 0) {
            System.out.println("Sent response");
        }
    }
}
