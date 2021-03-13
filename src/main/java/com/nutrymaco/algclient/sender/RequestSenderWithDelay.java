package com.nutrymaco.algclient.sender;

import com.nutrymaco.alg.AlgorithmResponse;

public class RequestSenderWithDelay implements RequestSender {

    private final RequestSender requestSender;
    private final long delay;

    public RequestSenderWithDelay(RequestSender requestSender, long delay) {
        this.requestSender = requestSender;
        this.delay = delay;
    }

    @Override
    public AlgorithmResponse sendRequest() {
        var response = requestSender.sendRequest();
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println("delay interrupted");
        }
        return response;
    }

    @Override
    public boolean isEnd() {
        return requestSender.isEnd();
    }
}
