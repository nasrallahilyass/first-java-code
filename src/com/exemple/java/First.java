package com.exemple.java;

public class First implements Runnable {
    ReentrantLockClass rlc;

    public First(ReentrantLockClass rlc) {
        this.rlc = rlc;
    }

    public void run() {
        rlc.print(5);
    }
}
