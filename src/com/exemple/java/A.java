package com.exemple.java;

public class A implements Runnable {


    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
