package com.kishkan91.support;

public class ArrayReverser {

    public static void reverseTheArray(double[] array) {
        int left  = 0;          // index of leftmost element
        int right = array.length-1; // index of rightmost element

        while (left < right) {
            double temp = array[left];
            array[left]  = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
