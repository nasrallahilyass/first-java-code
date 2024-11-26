package com.exemple.java;

public class A {

    Names names = new Names();

    public void work1() throws InterruptedException {
        synchronized (names) {
            System.out.println("Enter your name: ");
            names.wait();
            System.out.println(names.name);
        }
    }

    public void work2() throws InterruptedException {
        synchronized (names) {
            Thread.sleep(500);
            names.name = Thread.currentThread().getName();
            names.notify();
        }
    }
}
