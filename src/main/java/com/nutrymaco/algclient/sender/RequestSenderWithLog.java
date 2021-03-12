package com.nutrymaco.algclient.sender;

import com.nutrymaco.alg.AlgorithmResponse;

public class RequestSenderWithLog implements RequestSender {

    private final RequestSender requestSender;

    public RequestSenderWithLog(RequestSender requestSender) {
        this.requestSender = requestSender;
    }


    @Override
    public AlgorithmResponse sendRequest() {
        AlgorithmResponse result = requestSender.sendRequest();
        System.out.println("get result - " + result);
        return result;
    }

    @Override
    public boolean isEnd() {
        return requestSender.isEnd();
    }
}
