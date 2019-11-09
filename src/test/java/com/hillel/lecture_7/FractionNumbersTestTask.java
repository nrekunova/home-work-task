package com.hillel.lecture_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {

//    @Test
//    public void fractionNumbersTest() {
//        System.out.println("fractionNumbersTest");
//        FractionNumber fn = new FractionNumber(1, 2);
//        System.out.println("fn = " + fn);
//    }


    @Test
    public void fractionNumbersPlusTest() {
        FractionNumber fn = new FractionNumber(1, 4);
        FractionNumber fn1 = new FractionNumber(2, 4);
        assertEquals(fn.plus(fn1).toString(), "3/4"); ;
    }

    @Test
    public void fractionNumbersMinusTest() {
        FractionNumber fn = new FractionNumber(5, 8);
        FractionNumber fn1 = new FractionNumber(1, 8);
        assertEquals(fn.minus(fn1).toString(), "1/2"); ;
    }
    @Test
    public void fractionNumbersMultiplyTest() {
        FractionNumber fn = new FractionNumber(1, 2);
        FractionNumber fn1 = new FractionNumber(2, 3);
        assertEquals(fn.multiply(fn1).toString(), "1/3"); ;
    }

    @Test
    public void fractionNumbersDivideTest() {
        FractionNumber fn = new FractionNumber(1, 2);
        FractionNumber fn1 = new FractionNumber(2, 3);
        assertEquals(fn.divide(fn1).toString(), "3/4"); ;
    }
}
