package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("########## FileOutputStream ##########");
        FileOutputStream fos = new FileOutputStream("check.txt");
        fos.write("Hello World".getBytes());
        fos.flush(); // fix the issue of not writing the data to the file
        FileInputStream fis = new FileInputStream("check.txt");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }


    }
}

