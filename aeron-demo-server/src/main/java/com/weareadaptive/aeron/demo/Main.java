package com.weareadaptive.aeron.demo;

public class Main {
    public static void main(String... args) {
        EchoServer server = new EchoServer();
        server.start();
    }
}
