package com.example.myday1.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        singleThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("单线程的线程池实例");
            }
        });
        singleThreadPool.shutdown();
        Thread.sleep(1000L);
        System.out.println("结束");
//        singleThreadPool.c
    }
}
