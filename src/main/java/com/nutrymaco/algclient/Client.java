package com.nutrymaco.algclient;

import com.nutrymaco.algclient.request.RandomServerRequest;
import com.nutrymaco.algclient.result.MockServerResult;
import com.nutrymaco.algclient.result.ServerResultImpl;
import com.nutrymaco.algclient.result.ServerResultWithDelay;
import com.nutrymaco.algclient.sender.AsyncRequestSenderImpl;
import com.nutrymaco.algclient.sender.RequestSenderImpl;
import com.nutrymaco.algclient.sender.RequestSenderWithLog;
import io.grpc.netty.NettyChannelBuilder;

public class Client {
    private final static int CONCURRENCY = 20;
    private final static int DELAY = 100;
    private final static String HOST = "192.168.84.123";

    public static void main(String[] args) throws InterruptedException {
        final var channel = NettyChannelBuilder
                .forAddress(HOST, 8080)
                .usePlaintext()
                .build();

        new AsyncRequestSenderImpl(
                new RequestSenderWithLog(
                        new RequestSenderImpl(
                                new ServerResultWithDelay(
                                        new ServerResultImpl(channel,
                                                new RandomServerRequest(2000)),
                                        DELAY
                                ))
                ),
                CONCURRENCY
        ).sendRequest();
    }
}
