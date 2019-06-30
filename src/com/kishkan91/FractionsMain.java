package com.kishkan91;

import com.kishkan91.items.Fractions;
import com.kishkan91.services.DemoService;
import com.kishkan91.services.FractionsDemo;

public class FractionsMain {

    public static void main(String[] args) {

        Fractions fractions = new Fractions(1, 3, 6, 8);
        DemoService demo = new FractionsDemo(fractions);

        demo.makeTest();

    }
}
