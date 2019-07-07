package com.kishkan91.services;

public class Randomizer {
    public static int makeRandom(int min, int var) {
        return (int) (Math.random() * var + min);
    }
}
