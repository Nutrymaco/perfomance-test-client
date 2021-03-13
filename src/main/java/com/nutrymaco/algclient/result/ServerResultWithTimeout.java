package com.nutrymaco.algclient.result;

import com.google.common.util.concurrent.ListenableFutureTask;
import com.nutrymaco.alg.AlgorithmResponse;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ServerResultWithTimeout implements ServerResult {

    private final ServerResult serverResult;
    private final long timeout;

    public ServerResultWithTimeout(ServerResult serverResult, long timeout) {
        this.serverResult = serverResult;
        this.timeout = timeout;
    }

    @Override
    public AlgorithmResponse getResult() {
        var runnable = new Runnable() {
            AlgorithmResponse response;

            @Override
            public void run() {
                response = serverResult.getResult();
            }

            public AlgorithmResponse getResponse() {
                return response;
            }
        };
        var thread = new Thread(runnable);
        thread.start();
        try {
            thread.join(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException("timeout exceeded");
        }
        return runnable.getResponse();
    }

    @Override
    public boolean isEnd() {
        return serverResult.isEnd();
    }
}
