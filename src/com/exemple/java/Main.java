package com.exemple.java;


import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("C:/users/ME/Desktop/ILYASS NASRALLAH.pdf");

        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);

        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i]);
        }

        FileOutputStream fos = new FileOutputStream("C:/users/ME/Desktop/JAVA RESUME.pdf");
        fos.write(byteArray);
        fos.flush();
        fos.close();

    }
}

