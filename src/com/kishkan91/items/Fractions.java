package com.kishkan91.items;

public class Fractions {

    private int firstNumerator;
    private int firstDenominator;

    private int secondNumerator;
    private int secondDenominator;

    private int resultDenominator;
    private int resultNumerator;

    public Fractions(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        this.firstNumerator=firstNumerator;
        this.firstDenominator=firstDenominator;

        this.secondNumerator=secondNumerator;
        this.secondDenominator=secondDenominator;
    }

    public void makeFractionsSimpler() {
        int CommonFactor = this.determineCommonFactor(Math.abs(firstNumerator), firstDenominator);
        firstNumerator = firstNumerator / CommonFactor;
        firstDenominator = firstDenominator / CommonFactor;

        CommonFactor = this.determineCommonFactor(Math.abs(secondNumerator), secondDenominator);
        secondNumerator = secondNumerator / CommonFactor;
        secondDenominator = secondDenominator / CommonFactor;
    }

    public void makeResultFractionSimpler() {
        int CommonFactor = this.determineCommonFactor(Math.abs(resultNumerator), resultDenominator);
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
    
    

    private static int determineCommonFactor(int a, int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
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
