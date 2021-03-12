package com.nutrymaco.algclient.sender;

import com.google.common.util.concurrent.Futures;

import java.util.function.Consumer;

public interface AsyncRequestSender {
    void sendRequest();
}
