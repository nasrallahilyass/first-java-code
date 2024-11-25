package com.exemple.java;

public class Second implements Runnable {
    Sync sync;

    public Second(Sync sync) {
        this.sync = sync;
    }

    public void run() {
        sync.print(5);
    }
}
