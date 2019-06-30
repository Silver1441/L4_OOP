package com.kishkan91.services;

import com.kishkan91.items.Fractions;

public class FractionsDemo implements DemoService {

    private Fractions fractions;

    public FractionsDemo (Fractions fractions) {

        this.fractions = fractions;
    }

    public void makeTest() {

        System.out.println(" Исходные дроби:");
        System.out.println(fractions.getFirstNumerator()+"/"+fractions.getFirstDenominator() +"   "+
                fractions.getSecondNumerator()+"/"+fractions.getSecondDenominator());
        System.out.println();

        System.out.println(" Упрощение дробей:");
        fractions.makeFractionsSimpler();
        System.out.println(fractions.getFirstNumerator()+"/"+fractions.getFirstDenominator() +"   "+
                fractions.getSecondNumerator()+"/"+fractions.getSecondDenominator());
        System.out.println();

        System.out.println(" Сложение дробей:");
        fractions.sumTheFractions();
        System.out.println(fractions.getResultNumerator()+"/"+fractions.getResultDenominator());
        System.out.println();

        System.out.println(" Вычитание дробей:");
        fractions.subtractTheFractions();
        System.out.println(fractions.getResultNumerator()+"/"+fractions.getResultDenominator());
        System.out.println();

        System.out.println(" Умножение дробей:");
        fractions.multiplyTheFractions();
        System.out.println(fractions.getResultNumerator()+"/"+fractions.getResultDenominator());
        System.out.println();

        System.out.println(" Деление дробей:");
        fractions.divideTheFractions();
        System.out.println(fractions.getResultNumerator()+"/"+fractions.getResultDenominator());
        System.out.println();

    }

}
