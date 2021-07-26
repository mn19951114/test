package com.example.myday1.threadpool;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NyThread implements Runnable{

    private volatile Boolean exit = false;

    @Override
    public void run(){
        int count = 0;
        while (!exit){
            System.out.println("This is " +  this.hashCode() +" "+count+ " time");
        }
    }
}
