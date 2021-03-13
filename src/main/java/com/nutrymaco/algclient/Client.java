package com.nutrymaco.algclient;

import com.nutrymaco.algclient.request.FileServerRequest;
import com.nutrymaco.algclient.result.ServerProvider;
import com.nutrymaco.algclient.result.ServerResultImpl;
import com.nutrymaco.algclient.result.ServerResultWithTimeout;
import com.nutrymaco.algclient.sender.RequestSenderImpl;
import com.nutrymaco.algclient.sender.RequestSenderWithDelay;
import com.nutrymaco.algclient.sender.RequestSenderWithLog;
import com.nutrymaco.algclient.task.AsyncTaskExecutor;
import com.nutrymaco.algclient.task.SendTaskManagerImpl;
import com.nutrymaco.algclient.task.AsyncTaskExecutorWithTimePrint;
import io.grpc.netty.NettyChannelBuilder;

import java.io.IOException;
import java.nio.file.Path;

public class Client {
    private final static int CONCURRENCY = 100;
    private final static int DELAY = 500;
    private final static long TIMEOUT = 1000;
    private final static String HOST = "192.168.84.123";

    public static void main(String[] args) throws IOException, InterruptedException {
        final var channel = NettyChannelBuilder
                .forAddress(HOST, 8080)
                .usePlaintext()
                .build();


        new AsyncTaskExecutorWithTimePrint(
                new AsyncTaskExecutor(
                        new SendTaskManagerImpl(
                                new RequestSenderWithLog(
                                        new RequestSenderWithDelay(
                                                new RequestSenderImpl(
                                                        new ServerResultWithTimeout(
                                                                new ServerResultImpl(
                                                                        new ServerProvider(
                                                                                channel,
                                                                                new ContextImpl(args)
                                                                        ),
                                                                        new FileServerRequest(
                                                                                Path.of("src/main/resources/strings1.txt"),
                                                                                Path.of("src/main/resources/strings1.txt")
                                                                        )
                                                                ),
                                                                TIMEOUT
                                                        )
                                                ),
                                                DELAY
                                        )
                                ),
                                5000
                        ),
                        CONCURRENCY
                )
        ).printTime();
    }
}
