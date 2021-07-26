package com.example.myday1.threadpool;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class TestStopThread {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.submit(new NyThread());
//        executorService.submit(new NyThread());
//        Thread.sleep(100);
//        new NyThread().setExit(true);

        Semaphore semaphore = new Semaphore(5);
        ReentrantLock reentrantLock = new ReentrantLock();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new MyThread(i, semaphore);
            thread.start();
            thread.join();
        }
        System.out.println("it is over");
    }
}
