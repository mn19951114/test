package com.example.myday1.threadpool;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread{
        private int i;
        private Semaphore semaphore;

        public MyThread(int i, Semaphore semaphore){
            this.i=i;
            this.semaphore = semaphore;
        };

        @Override
        public void run(){
//            boolean isOr = semaphore.tryAcquire();
//            if(isOr){
                try {
                    semaphore.acquire();
                    System.out.println("我是线程"+i+",我得到了信号许可");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }


//            }

        }
}
