package com.kishkan91.services.demo;

import com.kishkan91.fractions.entities.Fraction;

import static com.kishkan91.fractions.services.FractionsCalculator.*;

public class FractionsDemo implements DemoService {
    private Fraction firstFraction;
    private Fraction secondFraction;

    public FractionsDemo(Fraction firstFraction, Fraction secondFraction) {
        this.firstFraction = firstFraction;
        this.secondFraction = secondFraction;
    }

    public void makeTest() {
        Fraction resultFraction;

        System.out.println(" Исходные дроби:");
        System.out.println(firstFraction.getNumerator() + "/" + firstFraction.getDenominator() + "   " +
                secondFraction.getNumerator() + "/" + secondFraction.getDenominator());
        System.out.println();

        System.out.println(" Упрощение дробей:");
        makeFractionsSimpler(firstFraction);
        makeFractionsSimpler(secondFraction);
        System.out.println(firstFraction.getNumerator() + "/" + firstFraction.getDenominator() + "   " +
                secondFraction.getNumerator() + "/" + secondFraction.getDenominator());
        System.out.println();

        System.out.println(" Сложение дробей:");
        resultFraction = sumTheFractions(firstFraction, secondFraction);
        System.out.println(resultFraction.getNumerator() + "/" + resultFraction.getDenominator());
        System.out.println();

        System.out.println(" Вычитание дробей:");
        resultFraction = subtractTheFractions(firstFraction, secondFraction);
        System.out.println(resultFraction.getNumerator() + "/" + resultFraction.getDenominator());
        System.out.println();

        System.out.println(" Умножение дробей:");
        resultFraction = multiplyTheFractions(firstFraction, secondFraction);
        System.out.println(resultFraction.getNumerator() + "/" + resultFraction.getDenominator());
        System.out.println();

        System.out.println(" Деление дробей:");
        resultFraction = divideTheFractions(firstFraction, secondFraction);
        System.out.println(resultFraction.getNumerator() + "/" + resultFraction.getDenominator());
        System.out.println();
    }
}
