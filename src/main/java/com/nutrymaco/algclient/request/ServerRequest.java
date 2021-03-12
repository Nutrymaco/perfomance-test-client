package com.nutrymaco.algclient.request;

import com.nutrymaco.alg.AlgorithmRequest;

public interface ServerRequest {
    AlgorithmRequest getRequest();
    boolean isEnd();
}
