package com.exemple.java;


public class Main {
    public static void main(String[] args) {
        try {
            String sAge = "102";
            int age = Integer.parseInt(sAge);
            if (age > 100) {
                throw (new Exception("You're dead"));
            }
            System.out.println("The age is " + age);
            String s = "Hello! I'm " + age + " years old";

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index not found");
        } catch (NumberFormatException e) {
            System.out.println("Number can't be converted to int");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Finished!");
    }
}
