package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.AlgorithmResponse;
import com.nutrymaco.alg.AlgorithmServiceGrpc;
import com.nutrymaco.algclient.request.ServerRequest;
import io.grpc.Channel;

public class ServerResultImpl implements ServerResult {
    private final AlgorithmServiceGrpc.AlgorithmServiceBlockingStub stub;
    private final ServerRequest serverRequest;

    public ServerResultImpl(Channel channel, ServerRequest serverRequest) {
        // тут будет выбор апи
        stub = AlgorithmServiceGrpc.newBlockingStub(channel);
        this.serverRequest = serverRequest;
    }

    public AlgorithmResponse getResult() {
        return stub.getResult(serverRequest.getRequest());
    }

    @Override
    public boolean isEnd() {
        return serverRequest.isEnd();
    }
}
