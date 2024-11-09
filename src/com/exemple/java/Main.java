package com.exemple.java;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converting numeric values:");
        int value = 300;
        System.out.println("int intValue = " + value);

        long longValue = value; // upcasting or widening
        System.out.println("long longValue = " + longValue);

        short shortValue = (short) value; // down casting
        System.out.println("short shortValue = " + shortValue);

        byte byteValue = (byte) value; // down casting
        System.out.println("byte byteValue = " + byteValue); //44
        /* DEC of 300 is 0001 0010 1100
            in byte we have only 8bits 0010 1100 == DEC 44
        */

    }
}
