package com.nutrymaco.algclient.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AsyncTaskExecutor {
    private final TaskManager taskManager;
    private final int concurrency;

    public AsyncTaskExecutor(TaskManager taskManager, int concurrency) {
        this.taskManager = taskManager;
        this.concurrency = concurrency;
    }

    public void execute() throws InterruptedException {
        var executor = Executors.newFixedThreadPool(concurrency);
        while (!taskManager.isEnd()) {
            var task = taskManager.getTask();
            executor.submit(task);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        executor.shutdownNow();
    }
}
