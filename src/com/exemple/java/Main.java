package com.exemple.java;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        A a = new A();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
        Thread t4 = new Thread(a);

        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);

        for (Thread t : threads) {
            es.execute(t);
        }

    }
}