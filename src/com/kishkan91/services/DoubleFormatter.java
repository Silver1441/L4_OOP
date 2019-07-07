package com.kishkan91.services;

public class DoubleFormatter {

    public static double formatDouble(double result) {

        String formattedResult = String.format("%.2f", result);
        formattedResult = formattedResult.replaceAll(",", ".");
        return (Double.valueOf(formattedResult));
    }
}
