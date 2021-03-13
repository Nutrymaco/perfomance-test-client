package com.nutrymaco.algclient.task;

import com.nutrymaco.algclient.sender.RequestSender;

public class SendTaskManagerImpl implements TaskManager {
    private final RequestSender requestSender;
    private int taskCount;

    public SendTaskManagerImpl(RequestSender requestSender, int taskCount) {
        this.requestSender = requestSender;
        this.taskCount = taskCount;
    }


    @Override
    public Runnable getTask() {
        taskCount--;
        return () -> requestSender.sendRequest();
    }

    @Override
    public boolean isEnd() {
        return taskCount == 0 || requestSender.isEnd();
    }
}
