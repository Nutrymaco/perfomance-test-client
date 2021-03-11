package com.nutrymaco.algclient;

import com.nutrymaco.alg.AlgorithmRequest;
import com.nutrymaco.alg.AlgorithmServiceGrpc;
import io.grpc.netty.NettyChannelBuilder;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Client {
    private final static int THREAD_COUNT = 10;
    private final static int TIME_OUT = 100;

    public static void main(String[] args) throws InterruptedException {
        final var channel = NettyChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        final var stub =
                AlgorithmServiceGrpc.newBlockingStub(channel);

        final var pool = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            pool.submit(() -> {
                var result = stub.getResult(
                        AlgorithmRequest.newBuilder()
                                .setString1("egerg")
                                .setString2("ger")
                                .build()
                );
                System.out.println("response : " + result);
                try {
                    Thread.sleep(TIME_OUT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.awaitTermination(1, TimeUnit.MINUTES);
    }
}
