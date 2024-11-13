package com.exemple.java;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone 12");
        Phone newPhone = new Phone("IOS", "Iphone 14 Pro Max", "Black", 2024, "Iphone");

        System.out.println("#############################");
        System.out.println(phone.getName());
        phone.setOs("IOS");
        System.out.println(phone.getOs());

        System.out.println("#############################");
        System.out.println(
                newPhone.getName() + " " +
                        newPhone.getOs() + " " +
                        newPhone.getColor() + " " +
                        newPhone.getYear() + " " +
                        newPhone.getModel()
        );
    }
}
