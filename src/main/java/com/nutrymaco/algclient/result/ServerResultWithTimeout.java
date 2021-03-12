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
        var future =
                ListenableFutureTask.create(serverResult::getResult);
        try {
            return future.get(timeout, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }

    @Override
    public boolean isEnd() {
        return serverResult.isEnd();
    }
}
