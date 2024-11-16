package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        SelfDrivable v1 = new CarV1();
        v1 = new CarV1();
        v1.drive();
        v1 = new CarV2();
        v1.drive();
    }
}

