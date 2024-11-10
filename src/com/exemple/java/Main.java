package com.exemple.java;

import java.util.Arrays;

public class Main {
    static boolean anonymous;
    public static void main(String[] args) {
        System.out.println("Arrays Type:");
        // Arrays and Array sort
        // fist way
        int[] numbers = {88, 1, 45, 33, 76, 3, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("SORTED Element of numbers array:");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // second way
        char[] arrayOfNumbers = {'f', 'b', 'e', 'c'};
        System.out.println("the length of the array is: " + arrayOfNumbers.length);
        System.out.println("the first element of the array is: " + arrayOfNumbers[0]);
        System.out.println("SORTED Element of arrayOfNumbers is: ");
        Arrays.sort(arrayOfNumbers);
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }
        // Array copy
        int[] original = {12, 3, 6, 81, 2};
        int[] copy = new int[5];
        System.arraycopy(original, 0, copy, 0, 5);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
