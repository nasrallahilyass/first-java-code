package com.exemple.java;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            a.work1();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            a.work2();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

        t1.start();
        t2.start();
    }
}