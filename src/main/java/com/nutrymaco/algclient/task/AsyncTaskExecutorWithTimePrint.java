package com.nutrymaco.algclient.task;

import java.time.OffsetDateTime;

public class AsyncTaskExecutorWithTimePrint {

    private final AsyncTaskExecutor executor;

    public AsyncTaskExecutorWithTimePrint(AsyncTaskExecutor executor) {
        this.executor = executor;
    }


    public void printTime() throws InterruptedException {
        OffsetDateTime startTime = OffsetDateTime.now();
        executor.execute();
        OffsetDateTime endTimeTime = OffsetDateTime.now();
        System.out.println("start - " + startTime);
        System.out.println("end - " + endTimeTime);
    }
}
