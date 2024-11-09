package com.exemple.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Math Classes:");

        int x = 36;
        int y = 20;

        int add = x + y;
        int sub = x - y;
        int mul = x * y;
        double div = (double) x / y;
        int mod = x % y;

        double negative = -98.887;
        double absNegative = Math.abs(negative);

        long rounded = Math.round(absNegative);

        double roundedCeil = Math.ceil(absNegative);
        double roundedFloor = Math.floor(absNegative);

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("###############################");
        System.out.println("Negative: " + negative);
        System.out.println("AbsNegative: " + absNegative);
        System.out.println("###############################");
        System.out.println("Rounded: " + rounded);
        System.out.println("RoundedCeil: " + roundedCeil);
        System.out.println("RoundedFloor: " + roundedFloor);
    }
}
