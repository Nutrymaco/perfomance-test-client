package com.nutrymaco.algclient.context;

import com.nutrymaco.alg.ApacheAlgorithmServiceGrpc;
import com.nutrymaco.alg.DebattyAlgorithmServiceGrpc;

public enum AlgorithmType {
    APACHE(ApacheAlgorithmServiceGrpc.class),
    DEBATTY(DebattyAlgorithmServiceGrpc.class);
    public final Class<?> serverClass;

    AlgorithmType(Class<?> serverClass) {
        this.serverClass = serverClass;
    }
}
