package com.exemple.java;

public class Main {
    static boolean anonymous;
    public static void main(String[] args) {
        System.out.println("Boolean Type:");


        boolean bool1 = true;
        System.out.println("Boolean is: " + bool1);

        boolean bool2 = false;
        System.out.println("Boolean is: " + bool2);

        System.out.println("Boolean Type: " + anonymous);

        String sBoolean = "false";
        boolean bBoolean = Boolean.parseBoolean(sBoolean);
        System.out.println("convert boolean from string to boolean type: " + bBoolean);


    }
}
