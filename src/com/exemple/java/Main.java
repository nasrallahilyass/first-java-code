package com.exemple.java;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Please Enter your name: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Hello " + name);
        String str1 = "Hi ";
        str1 = "H";
        String str2 = "Hi ";
        String str3 = "HI ";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
    }
}
