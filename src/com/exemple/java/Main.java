package com.exemple.java;


public class Main {
    public static boolean userCar = true;

    public static void main(String[] args) {
        int i, j, number;
        j = 0;
        number = 5;
        System.out.println("For loop:");
        for (i = 1; i <= 10; i++) {
            System.out.println(number + "X" + i + "=" + number * i);
        }
        System.out.println("###############################");
        System.out.println("While loop:");
        while (j <= 10) {
            System.out.println(number + "X" + j + "=" + number * j);
            j++;
        }
        System.out.println("###############################");
    }
}
