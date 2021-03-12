package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.AlgorithmResponse;

public class ServerResultWithDelay implements ServerResult {

    private final ServerResult serverResult;
    private final long delay;

    public ServerResultWithDelay(ServerResult serverResult, long delay) {
        this.serverResult = serverResult;
        this.delay = delay;
    }

    @Override
    public AlgorithmResponse getResult() {
        final AlgorithmResponse result = serverResult.getResult();
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
        }
        return result;
    }

    @Override
    public boolean isEnd() {
        return serverResult.isEnd();
    }
}
