package com.exemple.java;

public class ThreadSystem implements Runnable {
    public void run() {
        int count = 0;
        while (count < 5) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Count: " + count);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

