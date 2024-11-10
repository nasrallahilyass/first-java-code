package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        System.out.println("Postfix && Prefix");
        int postfixNumber = 10;
        int prefixNumber = 20;
        System.out.println("Postfix of number is: " + postfixNumber++);
        System.out.println("Postfix of number is: " + ++prefixNumber);

        System.out.println("Current value of postfix is: " + postfixNumber);
        System.out.println("Current value of prefix is: " + prefixNumber);

        /*
            Postfix of number is: 10
            Postfix of number is: 21
            Current value of postfix is: 11
            Current value of prefix is: 21
         */
    }
}
