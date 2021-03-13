package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.AlgorithmRequest;
import com.nutrymaco.alg.AlgorithmResponse;

import java.util.function.Function;

public interface Server extends Function<AlgorithmRequest, AlgorithmResponse> {
}
