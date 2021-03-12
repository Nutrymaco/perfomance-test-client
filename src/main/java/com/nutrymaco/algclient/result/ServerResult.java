package com.nutrymaco.algclient.result;

import com.nutrymaco.alg.AlgorithmResponse;

public interface ServerResult {
    AlgorithmResponse getResult();
    boolean isEnd();
}
