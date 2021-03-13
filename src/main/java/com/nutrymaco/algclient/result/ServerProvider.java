package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.ApacheAlgorithmServiceGrpc;
import com.nutrymaco.alg.DebattyAlgorithmServiceGrpc;
import com.nutrymaco.algclient.context.Context;
import io.grpc.Channel;

public class ServerProvider {
    private final Channel channel;
    private final Context context;

    public ServerProvider(Channel channel, Context context) {
        this.channel = channel;
        this.context = context;
    }

    public Server getServer() {
        var apacheStub =
                ApacheAlgorithmServiceGrpc.newBlockingStub(channel);
        var debuttyStub =
                DebattyAlgorithmServiceGrpc.newBlockingStub(channel);
        return switch (context.getAlgorithmType()) {
            case APACHE -> apacheStub::getResult;
            case DEBATTY -> debuttyStub::getResult;
        };

    }
}
