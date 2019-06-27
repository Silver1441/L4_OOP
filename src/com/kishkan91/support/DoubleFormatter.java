package com.kishkan91.support;

public class DoubleFormatter {

    public static double formatDouble(double result) {

        String formattedResult = String.format("%.2f", result);
        formattedResult = formattedResult.replaceAll(",",".");
        return (Double.valueOf(formattedResult));
    }
}
