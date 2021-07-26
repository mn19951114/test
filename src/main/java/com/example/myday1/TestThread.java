package com.example.myday1;

import com.example.myday1.threadpool.MyThread;

import java.util.HashMap;
import java.util.Map;

class Add{

    public synchronized static void add1(){
        System.out.println("I have add1()");
    }

    public synchronized void add2(){
        System.out.println("I have add2()");
    }
}
public class TestThread {
    public static void main(String[] args) throws InterruptedException {

//        Map<String, String> map = new HashMap<>();
//        map.put("","");
////        Calculate calculate = new Calculate();
//        Thread thread1 = new Thread(()->{
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Add.add1();
//        });
//        thread1.start();
//        Add add = new Add();
//        Thread thread2 = new Thread(()->{
//            add.add2();
//        });
//        thread2.start();

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread1 finished");
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread2 finished");
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread3 finished");
            }
        };
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();

    }
}
