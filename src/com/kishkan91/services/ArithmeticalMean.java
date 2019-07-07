package com.kishkan91.services;


public class ArithmeticalMean {
    public static double getMean(int... array) {
        double result = 0.0;
        for (int i : array) {
            result += +i;
        }
        if (array.length != 0) {
            result = DoubleFormatter.formatDouble(result / array.length);
        }
        return (result);
    }

    public static double getMean(double... array) {

        double result = 0.0;
        for (double i : array) {
            result += +i;
        }
        if (array.length != 0) {
            result = DoubleFormatter.formatDouble(result / array.length);
        }
        return (result);
    }
}
