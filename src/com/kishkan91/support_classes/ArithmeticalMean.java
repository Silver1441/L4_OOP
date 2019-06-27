package com.kishkan91.support_classes;


public class ArithmeticalMean {

    public static double getMean(int... array) {

        double result = 0.0;
        for (int i : array) {
            result = result + i ;
        }
        result = DoubleFormatter.formatDouble(result / array.length);
        return (result);
    }
}
