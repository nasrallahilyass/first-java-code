package com.exemple.java;

public class Main {

    public static void main(String[] args) {

        ThreadSystem threadA = new ThreadSystem();
        ThreadSystem threadB = new ThreadSystem();
        Thread thread1 = new Thread(threadA);
        Thread thread2 = new Thread(threadB);

        thread1.start();
        thread2.start();
    }
}