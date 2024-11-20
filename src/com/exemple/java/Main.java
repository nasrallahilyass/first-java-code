package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("########## File ##########");
        /*
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

         */
        File file = new File("Directory");
        file.mkdir();
        /*
        file.mkdirs(); //if you want to create multiple directories File file = new File("Directory1/Directory2/Directory3");
        file.delete();
         */
        String[] elements = file.list();

        //Constructors
        File file1 = new File("Directory", "file.txt");
        file1.createNewFile();
        File file2 = new File("Directory/Docs", "Microsoft Word Document.docx");
        file2.createNewFile();

        //List files in directory
        if (file.isDirectory()) {
            for (String element : elements) {
                System.out.println(element);
            }
        }

        // Write to file
        FileOutputStream fos = new FileOutputStream(file2);
        fos.write("Hello World!".getBytes());
        fos.flush();
        fos.close();

        // Read from file
        System.out.println("########## Read from file ##########");
        FileInputStream fis = new FileInputStream(file2);
        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        fis.close();
    }
}

