package com.kishkan91.fractions.services;

import com.kishkan91.fractions.entities.Fraction;

import static com.kishkan91.support.CommonFactorDeterminant.determineCommonFactor;
import static java.lang.Math.abs;

public class FractionsCalculator {
    public static void makeFractionsSimpler(Fraction fraction) {
        int commonFactor = determineCommonFactor(abs(fraction.getNumerator()), fraction.getDenominator());
        fraction.setNumerator(fraction.getNumerator() / commonFactor);
        fraction.setDenominator(fraction.getDenominator() / commonFactor);
    }

    public static Fraction sumTheFractions(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = (firstFraction.getNumerator() * secondFraction.getDenominator()) +
                (secondFraction.getNumerator() * firstFraction.getDenominator());

        int resultDenominator = secondFraction.getDenominator() * firstFraction.getDenominator();

        Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
        makeFractionsSimpler(resultFraction);
        return resultFraction;
    }

    public static Fraction subtractTheFractions(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = (firstFraction.getNumerator() * secondFraction.getDenominator()) -
                (secondFraction.getNumerator() * firstFraction.getDenominator());

        int resultDenominator = secondFraction.getDenominator() * firstFraction.getDenominator();

        Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
        makeFractionsSimpler(resultFraction);
        return resultFraction;
    }

    public static Fraction multiplyTheFractions(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = firstFraction.getNumerator() * secondFraction.getNumerator();

        int resultDenominator = firstFraction.getDenominator() * secondFraction.getDenominator();

        Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
        makeFractionsSimpler(resultFraction);
        return resultFraction;
    }

    public static Fraction divideTheFractions(Fraction firstFraction, Fraction secondFraction) {
        int resultNumerator = firstFraction.getNumerator() * secondFraction.getDenominator();

        int resultDenominator = firstFraction.getDenominator() * secondFraction.getNumerator();

        Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
        makeFractionsSimpler(resultFraction);
        return resultFraction;
    }
}
