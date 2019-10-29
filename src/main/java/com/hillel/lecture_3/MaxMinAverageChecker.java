package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    public int getMaxNumber(int a, int b , int c) {

        int result = 0;
        if (a != b && b != c) {
            result = Math.max(a, Math.max(b, c));
        }

        return result;
    }

    public int getAverageNumber(int a, int b , int c) {


        int result = 0;
        if (a == b && b ==c) {
            result = 0;
        } else if ((a < b && b < c) || (a > b && b > c)) {
            result = b;
        } else if ((b < a && a < c) || (b > a && a > c)) {
            result = a;
        } else {
            result = c;
        }


        return result;
    }

    public int getMinNumber(int a, int b , int c) {


        int result = 0;
        if (a != b && b != c) {
            result = Math.min(a, Math.min(b, c));
        }
        return result;
    }
}
