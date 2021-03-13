package com.nutrymaco.algclient.task;

public interface TaskManager {
    Runnable getTask();
    boolean isEnd();
}
