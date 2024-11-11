package com.exemple.java;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = new Locale("ar", "MA");
        System.out.println("Date: " + date);
        System.out.println("#######################################");
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Calender date: " + calendar.getTime());
        calendar.add(Calendar.DATE, 2);
        System.out.println("Calender updated date: " + calendar.getTime());
        System.out.println("#######################################");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("Date format: " + dateFormat.format(date));
    }
}
