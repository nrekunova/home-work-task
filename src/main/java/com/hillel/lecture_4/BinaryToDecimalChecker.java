package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

        int result = 0;
        int i = 0;
        while (value > 0) {
            int rest = value % 2;
            if (rest > 0) {
               value = value - rest;
               result = result + ((int) Math.pow(10, i));
            }
            value = value / 2;
            i++;
        }


        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {
        String vals = String.valueOf(value);
        int result = 0;
        for (int i = 0; i < vals.length(); i++) {
            char c = vals.charAt(vals.length() - (i +1));
            if (c == '1') {
                result = result + ((int) Math.pow(2, i));
            }
        }
        return result;
    }
}
