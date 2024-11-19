package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("########## File ##########");
        File file = new File("file.txt");
        System.out.println("Is file exists: " + file.exists());
        file.createNewFile();
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File writeable: " + file.canWrite());
            System.out.println("File readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last modified: " + file.lastModified());
            System.out.println("Can execute: " + file.canExecute());
        }
    }
}

