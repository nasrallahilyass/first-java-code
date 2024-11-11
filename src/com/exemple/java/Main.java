package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
//            if (i == 5) {
//                break;
//            }
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println("This is number:" + i);
            i++;
        }
        System.out.println("Loop has been finished");
    }
}
