package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        String str1 = "This is a string";
        System.out.println(str1);
        String str2 = "This is an other string";
        System.out.println(str2);
        String str3 = "My name is ";
        String str4 = "ILYASS, i'm ";
        String str5 = str3 + str4 + 24 + " years old.";
        System.out.println(str5);
        System.out.println("##################################");
        char[] chars = {'I', 'L', 'Y', 'A', 'S', 'S'};
        String str6 = new String(chars);
        System.out.println(str6);
        System.out.println("##################################");
        char[] toCharArray = str6.toCharArray();
        for (char c : toCharArray) {
            System.out.println(c);
        }
    }
}
