package com.nutrymaco.algclient;

import com.nutrymaco.algclient.context.AlgorithmType;
import com.nutrymaco.algclient.context.Context;

public class ContextImpl implements Context {

    private final String[] args;

    public ContextImpl(String[] args) {
        this.args = args;
    }

    @Override
    public AlgorithmType getAlgorithmType() {
        int number = Integer.parseInt(args[0]);
        return switch (number) {
            case 0 -> AlgorithmType.APACHE;
            case 1 -> AlgorithmType.DEBATTY;
            default -> throw new IllegalArgumentException();
        };
    }
}
