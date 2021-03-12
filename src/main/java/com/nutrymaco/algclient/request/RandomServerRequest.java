package com.nutrymaco.algclient.request;

import com.nutrymaco.alg.AlgorithmRequest;
import com.nutrymaco.algclient.request.ServerRequest;

import java.util.Random;

public class RandomServerRequest implements ServerRequest {

    private int count;
    private final Random random = new Random();

    public RandomServerRequest(int count) {
        this.count = count;
    }

    @Override
    public AlgorithmRequest getRequest() {
        if (isEnd()) {
            throw new IndexOutOfBoundsException();
        }
        count--;
        return AlgorithmRequest.newBuilder()
                .setString1(String.valueOf(random.nextFloat()))
                .setString2(String.valueOf(random.nextFloat()))
                .build();
    }

    @Override
    synchronized public boolean isEnd() {
        return count == 0;
    }
}
