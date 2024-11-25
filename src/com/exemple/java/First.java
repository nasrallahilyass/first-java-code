package com.exemple.java;

public class First implements Runnable {
    Sync sync;

    public First(Sync sync) {
        this.sync = sync;
    }

    public void run() {
        sync.print(5);
    }
}
