package com.exemple.java;


public class Main {
    public static boolean userCar = true;

    public static void main(String[] args) {
        System.out.println("Ternary operator:");
        int userAge = 18;
        String msg = (userAge >= 18 && userCar) ? "Allowed to drive" : "Not allowed to drive";
        System.out.println(msg);
        System.out.println("Switch case:");
        int grade = 1;
        switch (grade) {
            case 1:
                System.out.println("You are Excellent!");
                break;
            case 2:
                System.out.println("You are Good!");
                break;
            case 3:
                System.out.println("You are Bad!");
                break;
            default:
                System.out.println("Please enter a grad!");
        }

    }
}
