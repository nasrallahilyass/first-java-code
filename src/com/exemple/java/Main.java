package com.exemple.java;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("LocalDateTime && DateTimeFormatter:");
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println("##########################");
        System.out.println(dateFormatter.format(date));
        System.out.println("##########################");
        DateTimeFormatter dateFormatterPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormatterPattern.format(date));
        System.out.println("##########################");


    }
}
