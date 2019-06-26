package com.kishkan91.support_classes;

public class Randomizer {

    public static int  makeRandom(int min, int var) {
        return (int) (Math.random()*var + min);
    }
}
