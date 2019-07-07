package com.kishkan91.services.demo;

import com.kishkan91.fractions.services.FractionsCalculator;

public class FractionsDemo implements DemoService {

    private FractionsCalculator fractionsCalculator;

    public FractionsDemo (FractionsCalculator fractionsCalculator) {

        this.fractionsCalculator = fractionsCalculator;
    }

    public void makeTest() {

        System.out.println(" Исходные дроби:");
        System.out.println(fractionsCalculator.getFirstNumerator()+"/"+ fractionsCalculator.getFirstDenominator() +"   "+
                fractionsCalculator.getSecondNumerator()+"/"+ fractionsCalculator.getSecondDenominator());
        System.out.println();

        System.out.println(" Упрощение дробей:");
        fractionsCalculator.makeFractionsSimpler();
        System.out.println(fractionsCalculator.getFirstNumerator()+"/"+ fractionsCalculator.getFirstDenominator() +"   "+
                fractionsCalculator.getSecondNumerator()+"/"+ fractionsCalculator.getSecondDenominator());
        System.out.println();

        System.out.println(" Сложение дробей:");
        fractionsCalculator.sumTheFractions();
        System.out.println(fractionsCalculator.getResultNumerator()+"/"+ fractionsCalculator.getResultDenominator());
        System.out.println();

        System.out.println(" Вычитание дробей:");
        fractionsCalculator.subtractTheFractions();
        System.out.println(fractionsCalculator.getResultNumerator()+"/"+ fractionsCalculator.getResultDenominator());
        System.out.println();

        System.out.println(" Умножение дробей:");
        fractionsCalculator.multiplyTheFractions();
        System.out.println(fractionsCalculator.getResultNumerator()+"/"+ fractionsCalculator.getResultDenominator());
        System.out.println();

        System.out.println(" Деление дробей:");
        fractionsCalculator.divideTheFractions();
        System.out.println(fractionsCalculator.getResultNumerator()+"/"+ fractionsCalculator.getResultDenominator());
        System.out.println();

    }

}
