package com.exemple.java;


import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Convert primitive to string ");
        boolean b = true;
        int num = 2000;
        long longNum = 77_388_362; // just to make it simple to read

        String fromBoolean = Boolean.toString(b);
        String fromNumber = Integer.toString(num);
        String fromLong = Long.toString(longNum);

        System.out.println(
                "Here is the Convert primitive: "
                        + " " + fromBoolean
                        + " " + fromNumber
                        + " " + fromLong
        );

        System.out.println("###########################");
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String fromLongToFormat = formatter.format(longNum);
        System.out.println(fromLongToFormat);// 77,388,362
        System.out.println("###########################");
        System.out.println("StringBuilder: ");
        /*
        StringBuilder in Java is used for efficient,
        mutable string manipulation,
        especially in scenarios with frequent modifications or concatenations,
        avoiding the memory overhead of creating multiple String objects.
         */
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("My name is: ");
        stringBuilder.append("Ilyass ");
        stringBuilder.append("i'm Moroccan.");
        System.out.println(stringBuilder);
        stringBuilder.delete(stringBuilder.length() - 9, stringBuilder.length());
        System.out.println(stringBuilder);
    }
}
