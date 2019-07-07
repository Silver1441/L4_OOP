package com.kishkan91.support;

public class CommonFactorDeterminant {
    public static int determineCommonFactor(int a, int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
