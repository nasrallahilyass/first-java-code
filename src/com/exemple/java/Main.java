package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("########## File ##########");
        FileWriter file = new FileWriter("file.txt", true);
        PrintWriter writer = new PrintWriter(file);
        writer.println("Hello, World!");
        writer.println(2.81);
        writer.print(false);
        writer.flush();
        writer.close();
    }
}

