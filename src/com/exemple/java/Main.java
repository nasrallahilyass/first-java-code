package com.exemple.java;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("##########################");
        System.out.println("Reading file using Scanner");
        System.out.println("##########################");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        System.out.println("#######################################");
        System.out.println("Reading file using Scanner useDelimiter");
        System.out.println("#######################################");
        Scanner scanner2 = new Scanner(file);
        scanner2.useDelimiter("\\Z");
        System.out.println(scanner2.next());
        scanner2.close();
        System.out.println("###################################################");
        System.out.println("Reading file using Scanner useDelimiter only Digits");
        System.out.println("###################################################");
        Scanner scanner3 = new Scanner(file);
        scanner3.useDelimiter("\\D+");
        while (scanner3.hasNext()) {
            System.out.println(scanner3.next());
        }
        System.out.println("###################################################");
        System.out.println("###################################################");
        Scanner scanner4 = new Scanner(file);
        while (scanner4.hasNextLine()) {
            parseLine(scanner4.nextLine());
        }

    }

    static void parseLine(String str) {
        String name = "", job = "", phone = "";
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter(",");

        if (scanner.hasNext()) {
            name = scanner.next();
        }
        if (scanner.hasNext()) {
            job = scanner.next();
        }
        if (scanner.hasNext()) {
            phone = scanner.next();
        }

        System.out.println("Name: " + name + ", job: " + job + ", Phone: " + phone);
        scanner.close();
    }

}

