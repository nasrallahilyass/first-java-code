package com.exemple.java;


public class Main {
    // Main
    public static void main(String[] args) {
        System.out.println("###########################");
        Purchase(100, 0.2, "USD");
        System.out.println("###########################");
        /*
        System.out.println(Sum(10, 10));
        System.out.println(Diff(10, 2));
        System.out.println(Div(10, 2));
        System.out.println(Div(10, 0));
        System.out.println(Mul(5, 10));
        System.out.println(Squ(5));
         */
        System.out.println("###########################");
        Surface(4); // Square surface
        Surface(4, 5); // Triangle surface

    }

    // Calculate Price:
    public static void Purchase(int price, double tax, String currency) {
        System.out.println("Price: " + price + " || Tax: " + tax + " || Currency: " + currency);
        double taxIs = price * tax;
        System.out.println("Tax is: " + taxIs);
        double finalPrice = price + taxIs;
        System.out.println("Final Price: " + finalPrice + " " + currency);
        ConvertCurrency(currency, finalPrice);
    }

    public static void ConvertCurrency(String currency, double finalPrice) {
        switch (currency) {
            case "USD":
                System.out.println("To MAD: " + finalPrice * 10 + "MAD");
                break;
            case "EUR":
                System.out.println("To MAD: " + finalPrice * 11 + "MAD");
                break;
        }
    }

    // Operation:
    public static double Sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double Diff(int num1, int num2) {
        return num1 - num2;
    }

    public static int Mul(int num1, int num2) {
        return num1 * num2;
    }

    public static double Squ(int num1) {
        return Math.pow(num1, 2);
    }

    public static double Div(int num1, int num2) {
        try {
            return (double) num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        return 0;
    }


    // Methods overloading:

    // Square:
    public static void Surface(int num) {
        int surface;
        surface = num * num;
        System.out.println("Surface of Square is : " + surface);
    }

    // Rectangle:
    public static void Surface(int length, int width) {
        int surface;
        surface = length * width;
        System.out.println("Surface of Rectangle is : " + surface);
    }

}
