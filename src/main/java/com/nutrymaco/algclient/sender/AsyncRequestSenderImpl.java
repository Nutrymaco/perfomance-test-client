package com.nutrymaco.algclient.sender;

import com.nutrymaco.algclient.sender.AsyncRequestSender;
import com.nutrymaco.algclient.sender.RequestSender;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncRequestSenderImpl implements AsyncRequestSender {

    private final RequestSender requestSender;
    private final int concurrency;

    public AsyncRequestSenderImpl(RequestSender requestSender, int concurrency) {
        this.requestSender = requestSender;
        this.concurrency = concurrency;
    }

    @Override
    public void sendRequest() {
        var executor = Executors.newFixedThreadPool(concurrency);
        while (!requestSender.isEnd()) {
            executor.submit(() -> {
                if (!requestSender.isEnd()) {
                    requestSender.sendRequest();
                } else {
                    executor.shutdownNow();
                }
            });
        }
    }
}
