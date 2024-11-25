package com.exemple.java;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    ReentrantLock rlc = new ReentrantLock();

    public void print(int count) {
        System.out.println("This is a ReentrantLockClass method");
        try {
            rlc.lock();
            for (int i = 0; i < count; i++) {
                System.out.println(Thread.currentThread().getName() + " Count: " + count * i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rlc.unlock();
        }
    }


}
