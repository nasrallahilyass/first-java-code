package com.exemple.java;


import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        double number = 10090201;
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
        System.out.println(formatter.format(number));
        System.out.println("#############################");
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("currency: " + currFormatter.format(number));
    }
}
