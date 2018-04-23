package org.kaazing.gateway.aeron;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

import org.kaazing.gateway.server.Gateway;
import org.kaazing.gateway.server.GatewayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    /*
    /usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/java
    -javaagent:/idea-IC-173.4301.25/lib/idea_rt.jar=35240:/idea-IC-173.4301.25/bin
    -Dfile.encoding=UTF-8
    -classpath
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/charsets.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/cldrdata.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/dnsns.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/jaccess.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/localedata.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/nashorn.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunec.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/zipfs.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jce.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jsse.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/management-agent.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/resources.jar:
        /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/rt.jar:
        /home/dev/src/aeron-gateway/target/classes:
        /home/dev/src/server/target/classes:
        /home/dev/src/service/spi/target/classes:
        /home/dev/.m2/repository/com/hazelcast/hazelcast/3.7.4/hazelcast-3.7.4.jar:
        /home/dev/.m2/repository/com/hazelcast/hazelcast-client/3.7.4/hazelcast-client-3.7.4.jar:
        /home/dev/.m2/repository/com/hazelcast/hazelcast-aws/1.1.1/hazelcast-aws-1.1.1.jar:
        /home/dev/src/resource.address/spi/target/classes:
        /home/dev/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:
        /home/dev/src/transport/spi/target/classes:
        /home/dev/src/mina.netty/target/classes:
        /home/dev/.m2/repository/io/netty/netty/3.10.5.Final/netty-3.10.5.Final.jar:
        /home/dev/src/mina.core/core/target/classes:
        /home/dev/src/mina.core/integration-beans/target/classes:
        /home/dev/src/mina.core/integration-jmx/target/classes:
        /home/dev/src/mina.core/integration-ognl/target/classes:
        /home/dev/.m2/repository/ognl/ognl/2.7.2/ognl-2.7.2.jar:
        /home/dev/.m2/repository/jboss/javassist/3.7.ga/javassist-3.7.ga.jar:
        /home/dev/.m2/repository/org/agrona/Agrona/0.9.1/Agrona-0.9.1.jar:
        /home/dev/src/security/target/classes:
        /home/dev/src/util/target/classes:
        /home/dev/src/server.api/target/classes:
        /home/dev/src/server.spi/target/classes:
        /home/dev/.m2/repository/org/apache/xmlbeans/xmlbeans/2.4.0/xmlbeans-2.4.0.jar:
        /home/dev/.m2/repository/stax/stax-api/1.0.1/stax-api-1.0.1.jar:
        /home/dev/.m2/repository/org/jdom/jdom/1.1/jdom-1.1.jar:
        /home/dev/.m2/repository/commons-cli/commons-cli/1.2/commons-cli-1.2.jar:
        /home/dev/.m2/repository/org/slf4j/slf4j-log4j12/1.7.21/slf4j-log4j12-1.7.21.jar:
        /home/dev/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:
        /home/dev/.m2/repository/net/sf/opencsv/opencsv/2.3/opencsv-2.3.jar:
        /home/dev/.m2/repository/org/json/json/20090211/json-20090211.jar:
        /home/dev/src/service/echo/target/classes:
        /home/dev/src/transport/http/target/classes:
        /home/dev/src/transport/pipe/target/classes:
        /home/dev/src/resource.address/pipe/target/classes:
        /home/dev/src/transport/nio/target/classes:
        /home/dev/src/resource.address/tcp/target/classes:
        /home/dev/src/transport/bio/target/classes:
        /home/dev/src/resource.address/udp/target/classes:
        /home/dev/src/transport/ws/target/classes:
        /home/dev/src/transport/wseb/target/classes:
        /home/dev/src/resource.address/http/target/classes:
        /home/dev/src/resource.address/ssl/target/classes:
        /home/dev/src/resource.address/httpx/target/classes:
        /home/dev/src/resource.address/httpxdraft/target/classes:
        /home/dev/src/resource.address/httpxe/target/classes:
        /home/dev/src/resource.address/ws/target/classes:
        /home/dev/src/resource.address/wsdraft/target/classes:
        /home/dev/src/resource.address/wsx/target/classes:
        /home/dev/src/resource.address/wsxdraft/target/classes:
        /home/dev/src/resource.address/wsn/target/classes:
        /home/dev/src/resource.address/wse/target/classes:
        /home/dev/src/transport/wsn/target/classes:
        /home/dev/src/bridge/gateway.bridge/target/classes:
        /home/dev/.m2/repository/org/kaazing/gateway.client.java.bridge/5.0.0.5/gateway.client.java.bridge-5.0.0.5.jar:
        /home/dev/.m2/repository/org/kaazing/gateway.client.java.transport/5.0.0.6/gateway.client.java.transport-5.0.0.6.jar:
        /home/dev/src/bridge/gateway.client.javascript.bridge/target/classes:
        /home/dev/.m2/repository/io/aeron/aeron-all/1.8.2/aeron-all-1.8.2.jar:
        /home/dev/.m2/repository/org/agrona/agrona/0.9.15/agrona-0.9.15.jar

        org.kaazing.gateway.aeron.Main




       /usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/java -javaagent:
       /idea-IC-173.4301.25/lib/idea_rt.jar=32837:
       /idea-IC-173.4301.25/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/charsets.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/cldrdata.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/dnsns.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/jaccess.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/localedata.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/nashorn.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunec.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/zipfs.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jce.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jsse.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/management-agent.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/resources.jar:
       /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/rt.jar:
       /home/dev/src/aeron-gateway/target/classes:
       /home/dev/src/server/target/classes:
       /home/dev/src/service/spi/target/classes:
       /home/dev/.m2/repository/com/hazelcast/hazelcast/3.7.4/hazelcast-3.7.4.jar:
       /home/dev/.m2/repository/com/hazelcast/hazelcast-client/3.7.4/hazelcast-client-3.7.4.jar:
       /home/dev/.m2/repository/com/hazelcast/hazelcast-aws/1.1.1/hazelcast-aws-1.1.1.jar:
       /home/dev/src/resource.address/spi/target/classes:
       /home/dev/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:
       /home/dev/src/transport/spi/target/classes:
       /home/dev/src/mina.netty/target/classes:
       /home/dev/.m2/repository/io/netty/netty/3.10.5.Final/netty-3.10.5.Final.jar:
       /home/dev/src/mina.core/core/target/classes:
       /home/dev/src/mina.core/integration-beans/target/classes:
       /home/dev/src/mina.core/integration-jmx/target/classes:
       /home/dev/src/mina.core/integration-ognl/target/classes:
       /home/dev/.m2/repository/ognl/ognl/2.7.2/ognl-2.7.2.jar:
       /home/dev/.m2/repository/jboss/javassist/3.7.ga/javassist-3.7.ga.jar:
       /home/dev/.m2/repository/org/agrona/Agrona/0.9.1/Agrona-0.9.1.jar:
       /home/dev/src/security/target/classes:
       /home/dev/src/util/target/classes:
       /home/dev/src/server.api/target/classes:
       /home/dev/src/server.spi/target/classes:
       /home/dev/.m2/repository/org/apache/xmlbeans/xmlbeans/2.4.0/xmlbeans-2.4.0.jar:
       /home/dev/.m2/repository/stax/stax-api/1.0.1/stax-api-1.0.1.jar:
       /home/dev/.m2/repository/org/jdom/jdom/1.1/jdom-1.1.jar:
       /home/dev/.m2/repository/commons-cli/commons-cli/1.2/commons-cli-1.2.jar:
       /home/dev/.m2/repository/org/slf4j/slf4j-log4j12/1.7.21/slf4j-log4j12-1.7.21.jar:
       /home/dev/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:
       /home/dev/.m2/repository/net/sf/opencsv/opencsv/2.3/opencsv-2.3.jar:
       /home/dev/.m2/repository/org/json/json/20090211/json-20090211.jar:
       /home/dev/src/service/echo/target/classes:
       /home/dev/src/transport/http/target/classes:
       /home/dev/src/transport/pipe/target/classes:
       /home/dev/src/resource.address/pipe/target/classes:
       /home/dev/src/transport/nio/target/classes:
       /home/dev/src/resource.address/tcp/target/classes:
       /home/dev/src/transport/bio/target/classes:
       /home/dev/src/resource.address/udp/target/classes:
       /home/dev/src/transport/ws/target/classes:
       /home/dev/src/transport/wseb/target/classes:
       /home/dev/src/resource.address/http/target/classes:
       /home/dev/src/resource.address/ssl/target/classes:
       /home/dev/src/resource.address/httpx/target/classes:
       /home/dev/src/resource.address/httpxdraft/target/classes:
       /home/dev/src/resource.address/httpxe/target/classes:
       /home/dev/src/resource.address/ws/target/classes:
       /home/dev/src/resource.address/wsdraft/target/classes:
       /home/dev/src/resource.address/wsx/target/classes:
       /home/dev/src/resource.address/wsxdraft/target/classes:
       /home/dev/src/resource.address/wsn/target/classes:
       /home/dev/src/resource.address/wse/target/classes:
       /home/dev/src/transport/wsn/target/classes:
       /home/dev/src/bridge/gateway.bridge/target/classes:
       /home/dev/.m2/repository/org/kaazing/gateway.client.java.bridge/5.0.0.5/gateway.client.java.bridge-5.0.0.5.jar:
       /home/dev/.m2/repository/org/kaazing/gateway.client.java.transport/5.0.0.6/gateway.client.java.transport-5.0.0.6.jar:
       /home/dev/src/bridge/gateway.client.javascript.bridge/target/classes:
       /home/dev/.m2/repository/io/aeron/aeron-all/1.8.2/aeron-all-1.8.2.jar:
       /home/dev/.m2/repository/org/agrona/agrona/0.9.15/agrona-0.9.15.jar org.kaazing.gateway.aeron.Main


         */

    public static void main(String... args) throws IOException {
        Properties properties = System.getProperties();

        Path configDirectory = Files.createTempDirectory(null);
        properties.setProperty(Gateway.GATEWAY_CONFIG_DIRECTORY_PROPERTY, configDirectory.toString());
        String gatewayConfigFile = "gateway-config.xml";
        copyResource(gatewayConfigFile, configDirectory.resolve(gatewayConfigFile));
        String logConfigFile = "log4j-config.xml";
        copyResource(logConfigFile, configDirectory.resolve(logConfigFile));

        Path tempDirectory = Files.createTempDirectory(null);
        properties.setProperty(Gateway.GATEWAY_TEMP_DIRECTORY_PROPERTY, tempDirectory.toString());

        // Because Gateway already has checking for defaults (and they default
        // to directories under $GATEWAY_HOME), we don't actually have to do anything
        // here (we do in the InstalledLinux case.)
        final Gateway gateway = GatewayFactory.createGateway();
        gateway.setProperties(properties);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                gateway.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));

        try {
            gateway.launch();
        } catch (Exception ex) {
            // Log the exception then exit. It's possible log4j won't be initialized by the time
            // the exception occurred, so log and print stacktrace (to System.err)
            LOGGER.error("Gateway failed to launch", ex);
            ex.printStackTrace();
            System.exit(-1);
        }
    }

    private static void copyResource(String resourcePath, Path outputPath) throws IOException {
        try (InputStream inStream = Main.class.getClassLoader().getResourceAsStream(resourcePath)) {
            try (OutputStream outStream = Files.newOutputStream(outputPath, StandardOpenOption.CREATE_NEW)) {
                byte[] buffer = new byte[64 * 1024];
                int consumedBytes;
                while ((consumedBytes = inStream.read(buffer)) > 0) {
                    outStream.write(buffer, 0, consumedBytes);
                }
            }
        }
    }
}
