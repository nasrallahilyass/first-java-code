package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("########## File ##########");
        FileWriter file = new FileWriter("file.txt");
        file.write("Wow! That was easy to write :)");
        file.close();
    }
}

