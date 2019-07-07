package com.kishkan91.fractions;

import com.kishkan91.fractions.entities.Fraction;
import com.kishkan91.services.DemoService;
import com.kishkan91.fractions.services.FractionsDemo;

public class FractionsMain {
    public static void main(String[] args) {

        DemoService demo = new FractionsDemo(new Fraction(1, 3),
                new Fraction(6, 8));

        demo.makeTest();

    }
}
