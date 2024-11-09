package com.exemple.java;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("BigDecimal:");
        double value = .15;
        double total = value * 3;
        System.out.println("total: " + total); // 0.44999999999999996

        String valueText = Double.toString(value);
        System.out.println("valueText: " + valueText);

        BigDecimal bigDecimalValue = new BigDecimal(valueText);
        BigDecimal bigDecimalTotal = bigDecimalValue.add(bigDecimalValue.add(bigDecimalValue));
        System.out.println("bigDecimalTotal: " + bigDecimalTotal);

    }
}
