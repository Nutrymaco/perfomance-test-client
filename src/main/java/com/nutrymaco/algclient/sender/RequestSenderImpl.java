package com.nutrymaco.algclient.sender;

import com.nutrymaco.alg.AlgorithmResponse;
import com.nutrymaco.algclient.result.ServerResult;

public class RequestSenderImpl implements RequestSender {

    private final ServerResult result;

    public RequestSenderImpl(ServerResult result) {
        this.result = result;
    }


    @Override
    public AlgorithmResponse sendRequest() {
        return result.getResult();
    }

    @Override
    public boolean isEnd() {
        return result.isEnd();
    }
}
