package com.tdc.heroes.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HeroesServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Server has been started");

        Server server = ServerBuilder
                .forPort(50051)
                .addService(new HeroesServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> {
                    System.out.println("Shutting down the server");
                    server.shutdown();
                })
        );

        server.awaitTermination();
    }
}
