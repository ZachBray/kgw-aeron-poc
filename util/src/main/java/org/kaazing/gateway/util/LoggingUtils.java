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
package org.kaazing.gateway.util;

import org.slf4j.Logger;

/**
 * @deprecated Use org.kaazing.gateway.transport.LoggingUtils instead
 */
@Deprecated
public final class LoggingUtils {

    private LoggingUtils() {
        // so as not to be instantiated
    }

    public static void log(Logger logger, Throwable t) {
        if (logger.isDebugEnabled()) {
            logger.debug(t.getMessage(), t);
        } else {
            logger.info(t.getMessage());
        }
    }

    public static void log(Logger logger, String message, Throwable t) {
        if (logger.isDebugEnabled()) {
            logger.debug(message, t);
        } else {
            logger.info(message);
        }
    }

}
