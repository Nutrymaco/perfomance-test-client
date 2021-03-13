package com.nutrymaco.algclient.request;

import com.nutrymaco.alg.AlgorithmRequest;
import com.nutrymaco.algclient.request.ServerRequest;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class RandomServerRequest implements ServerRequest {

    private final Random random = new Random();

    @Override
    public AlgorithmRequest getRequest() {
        return AlgorithmRequest.newBuilder()
                .setString1(String.valueOf(random.nextFloat()))
                .setString2(String.valueOf(random.nextFloat()))
                .build();
    }

    @Override
    synchronized public boolean isEnd() {
        return false;
    }
}
