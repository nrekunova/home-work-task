package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {
        String result = "";
        int i = 0;
        while (value > 0) {
            int rest = value % 16;
            value = value - rest;
            String c = "";
            if (rest == 10) {
                c = "A";
            } else if (rest == 11) {
                c = "B";
            } else if (rest == 12) {
                c = "C";
            } else if (rest == 13) {
                c = "D";
            } else if (rest == 14) {
                c = "E";
            } else if (rest == 15) {
                c = "F";
            } else {
                c = String.valueOf(rest);
            }
            result = c + result;
            value = value / 16;
            i++;
        }


        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

        int result = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(value.length() - (i + 1));
            int num = 0;
            if (c == 'A') {
                num = 10;
            } else if (c == 'B') {
                num = 11;
            } else if (c == 'C') {
                num = 12;
            } else if (c == 'D') {
                num = 13;
            } else if (c == 'E') {
                num = 14;
            } else if (c == 'F') {
                num = 15;
            } else {
                num = Integer.valueOf(String.valueOf(c));
            }
            result = result + num * ((int) Math.pow(16, i));
        }
        return result;
    }
}
