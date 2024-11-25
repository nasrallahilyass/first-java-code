package com.exemple.java;

public class Main {

    public static void main(String[] args) {
        /*
        ThreadSystem threadA = new ThreadSystem();
        ThreadSystem threadB = new ThreadSystem();
        Thread thread1 = new Thread(threadA);
        Thread thread2 = new Thread(threadB);

        thread1.start();
        thread2.start();

         */
        Sync sync = new Sync();
        First first = new First(sync);
        Second second = new Second(sync);

        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);

        thread1.start();
        thread2.start();
    }
}