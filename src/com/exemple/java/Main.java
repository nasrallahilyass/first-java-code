package com.exemple.java;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        System.out.println("########## FileInputStream ##########");
        System.out.println("First way to read the file: ");
        System.out.println("Print the whole file: ");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println((char) data);
        }
        fis.close();
        System.out.println("Second way to read the file: ");
        File file = new File("test.txt");
        FileInputStream fis2 = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis2.read(byteArray);
        String data2 = new String(byteArray);
        System.out.println(data2);
        fis2.close();

    }
}

