package com.exemple.java;

public class Main {
    static boolean anonymous;
    public static void main(String[] args) {
        System.out.println("Character Type:");
        char firstChar = 'a';
        char secondChar = 'b';
        char thirdChar = 'c';
        System.out.println("firstChar is: " + firstChar);
        System.out.println("secondChar is: " + secondChar);
        System.out.println("thirdChar is: " + thirdChar);

        char character = '\u00c6'; //Æ
        System.out.println("character is: " + character);

        System.out.println("Check this out:");
        System.out.print(Character.toUpperCase(firstChar));
        System.out.print(Character.toUpperCase(secondChar));
        System.out.println(Character.toUpperCase(thirdChar));
    }
}
