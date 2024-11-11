package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        int age = 17;
        int pointer = 1;
        // Do While loop:
        /*  Use while if you :
                want the loop to run only if the condition is true from the beginning.
            Use do-while if you:
                need the loop to run at least once, regardless of the condition.
        */
        do {
            System.out.println("You're successfully tests are: " + pointer);
            pointer++;
        }
        while (pointer <= 3 && age >= 18);
        // For each loop:
        int[] numbers = {13, 1, 54, 6, 77};
        for (int number : numbers) {
            System.out.println("number is: " + number);
        }
    }

    ;
}
