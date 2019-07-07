package com.kishkan91.services;

public class CommonFactorDeterminant {
    public static int determineCommonFactor(int a, int b) {
        while (b != 0) {
            int temporalVar = a % b;
            a = b;
            b = temporalVar;
        }
        return a;
    }
}
