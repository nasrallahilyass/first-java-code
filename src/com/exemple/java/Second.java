package com.exemple.java;

public class Second implements Runnable {
    ReentrantLockClass rlc;

    public Second(ReentrantLockClass rlc) {
        this.rlc = rlc;
    }

    public void run() {
        rlc.print(5);
    }
}
