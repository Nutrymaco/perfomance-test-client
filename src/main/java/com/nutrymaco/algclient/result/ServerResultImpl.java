package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.AlgorithmRequest;
import com.nutrymaco.alg.AlgorithmResponse;
import com.nutrymaco.alg.ApacheAlgorithmServiceGrpc;
import com.nutrymaco.algclient.request.ServerRequest;
import io.grpc.Channel;

import java.util.function.Function;

public class ServerResultImpl implements ServerResult {
    private final Function<AlgorithmRequest, AlgorithmResponse> server;
    private final ServerRequest serverRequest;

    public ServerResultImpl(ServerProvider serverProvider, ServerRequest serverRequest) {
        this.server = serverProvider.getServer();
        this.serverRequest = serverRequest;
    }

    public AlgorithmResponse getResult() {
        return server.apply(serverRequest.getRequest());
    }

    @Override
    public boolean isEnd() {
        return serverRequest.isEnd();
    }
}