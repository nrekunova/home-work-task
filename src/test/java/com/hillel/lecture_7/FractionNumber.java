package com.hillel.lecture_7;

/**
 * Created by alpa on 11/8/19
 * numerator
 * denominator
 */
public class FractionNumber {
    public int numerator;
    public int denominator;

    public FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduction();
    }

    public void reduction() {
        int c = Math.min(numerator, denominator);
        for (int i = c; i > 1; i--) {
            if(numerator % i == 0 && denominator % i == 0){
                numerator = numerator / i;
                denominator = denominator/ i;
            }
        }
    }

    public FractionNumber plus(FractionNumber fn) {
        int num = this.numerator * fn.denominator + this.denominator * fn.numerator;
        int den = this.denominator * fn.denominator;
        FractionNumber sum = new FractionNumber(num, den);
        return sum;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public FractionNumber minus(FractionNumber fn) {
        int num = this.numerator * fn.denominator - this.denominator * fn.numerator;
        int den = this.denominator * fn.denominator;
        FractionNumber sum = new FractionNumber(num, den);
        return sum;
    }

    public FractionNumber multiply(FractionNumber fn) {
        int num = this.numerator * fn.numerator;
        int den = this.denominator * fn.denominator;
        FractionNumber sum = new FractionNumber(num, den);
        return sum;
    }

    public FractionNumber divide(FractionNumber fn) {
        int num = this.numerator * fn.denominator;
        int den = this.denominator * fn.numerator;
        FractionNumber sum = new FractionNumber(num, den);
        return sum;
    }
}

