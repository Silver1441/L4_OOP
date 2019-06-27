package com.kishkan91.support;

public class Randomizer {

    public static int  makeRandom(int min, int var) {
        return (int) (Math.random()*var + min);
    }
}
