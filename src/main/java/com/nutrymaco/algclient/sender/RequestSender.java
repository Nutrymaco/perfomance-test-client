package com.nutrymaco.algclient.sender;

import com.nutrymaco.alg.AlgorithmResponse;

public interface RequestSender {
    AlgorithmResponse sendRequest();
    boolean isEnd();
}
