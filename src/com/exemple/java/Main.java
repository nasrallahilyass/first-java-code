package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        String str = "Hello!";
        char[] chars = str.toCharArray();
        try {
            for (int i = 0; i <= chars.length; i++) {
                System.out.println(chars[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Finished!");
    }
}
