package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("########## File ##########");
        FileWriter fw = new FileWriter("file.txt");
        System.out.println("########## FileWriter ##########");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello World");
        bw.newLine();
        bw.write("That was super easy !");
        bw.flush();
        bw.close();

        System.out.println("########## FileReader ##########");
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine(); // read next line
        }
    }
}

