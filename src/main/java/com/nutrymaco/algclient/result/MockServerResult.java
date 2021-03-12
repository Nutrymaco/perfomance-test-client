package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.AlgorithmResponse;
import com.nutrymaco.algclient.request.ServerRequest;

public class MockServerResult implements ServerResult {
    private final ServerRequest serverRequest;

    public MockServerResult(ServerRequest serverRequest) {
        this.serverRequest = serverRequest;
    }

    @Override
    public AlgorithmResponse getResult() {
        return AlgorithmResponse.newBuilder()
                .setResult(serverRequest.getRequest().getString1().length())
                .build();
    }

    @Override
    public boolean isEnd() {
        return serverRequest.isEnd();
    }
}
