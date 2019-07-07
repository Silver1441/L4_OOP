package com.kishkan91.fractions.services;

import com.kishkan91.fractions.entities.Fraction;

import static com.kishkan91.support.CommonFactorDeterminant.determineCommonFactor;
import static java.lang.Math.abs;

public class FractionsCalculator {
    private Fraction firstFraction;
    private Fraction secondFraction;

    private int resultDenominator;
    private int resultNumerator;

    public FractionsCalculator(Fraction firstFraction, Fraction secondFraction) {
        this.firstFraction = firstFraction;
        this.secondFraction = secondFraction;

    }

    public void makeFractionsSimpler() {
        int CommonFactor = determineCommonFactor(abs(firstFraction.getNumerator()), firstDenominator);
        firstNumerator = firstNumerator / CommonFactor;
        firstDenominator = firstDenominator / CommonFactor;

        CommonFactor = determineCommonFactor(abs(secondNumerator), secondDenominator);
        secondNumerator = secondNumerator / CommonFactor;
        secondDenominator = secondDenominator / CommonFactor;
    }

    public void makeResultFractionSimpler() {
        int CommonFactor = determineCommonFactor(abs(resultNumerator), resultDenominator);
        resultNumerator = resultNumerator / CommonFactor;
        resultDenominator = resultDenominator / CommonFactor;
    }

    public void sumTheFractions() {
        resultDenominator = secondDenominator * firstDenominator;
        resultNumerator = (firstNumerator * secondDenominator) + (secondNumerator * firstDenominator);
        this.makeResultFractionSimpler();
    }

    public void subtractTheFractions() {
        resultDenominator = secondDenominator * firstDenominator;
        resultNumerator = (firstNumerator * secondDenominator) - (secondNumerator * firstDenominator);
        this.makeResultFractionSimpler();
    }

    public void multiplyTheFractions() {
        resultNumerator = firstNumerator * secondNumerator;
        resultDenominator = firstDenominator * secondDenominator;
        this.makeResultFractionSimpler();
    }

    public void divideTheFractions() {
        resultNumerator = firstNumerator * secondDenominator;
        resultDenominator = firstDenominator * secondNumerator;
        this.makeResultFractionSimpler();
    }

    public int getFirstNumerator() {
        return firstNumerator;
    }

    public int getFirstDenominator() {
        return firstDenominator;
    }

    public int getSecondNumerator() {
        return secondNumerator;
    }

    public int getSecondDenominator() {
        return secondDenominator;
    }

    public int getResultDenominator() {
        return resultDenominator;
    }

    public int getResultNumerator() {
        return resultNumerator;
    }
}
