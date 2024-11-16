package com.exemple.java;


public class Main {
    static void funSuv(SUV obj) {
        obj.autoPilot();
    }

    static void funHach(HachBach obj) {
        obj.autoPilot();
    }

    static void fun(Car obj) {
        obj.autoPilot();
    }


    public static void main(String[] args) {
        SUV suv = new SUV(4, 1, 1000);
        HachBach hachBach = new HachBach(8, 2, 2000);

        System.out.println(hachBach);
        System.out.println(suv);
        System.out.println("#################################");
        funSuv(new SUV());
        funHach(new HachBach());
        System.out.println("#################################");
        fun(new SUV());
        funHach(new HachBach());
    }

}

