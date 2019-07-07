package com.kishkan91;

import com.kishkan91.fractions.services.FractionsCalculator;
import com.kishkan91.services.demo.DemoService;
import com.kishkan91.services.demo.FractionsDemo;

public class FractionsMain {
    public static void main(String[] args) {
        FractionsCalculator fractionsCalculator = new FractionsCalculator(1, 3, 6, 8);
        DemoService demo = new FractionsDemo(fractionsCalculator);

        demo.makeTest();

    }
}
