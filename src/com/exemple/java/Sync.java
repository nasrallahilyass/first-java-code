package com.exemple.java;

public class Sync {
    public void print(int count) {
        System.out.println("This is a synchronized method");
        synchronized (this) {
            for (int i = 0; i < count; i++) {
                System.out.println(Thread.currentThread().getName() + " Count: " + count * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
