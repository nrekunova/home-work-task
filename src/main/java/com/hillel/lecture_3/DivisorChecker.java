package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int number, int divisor) {

        String result = "";
        if ((number % divisor) == 0) {
            result = "The number " + divisor + " is divisor of the number " + number;
        } else {

            result = "The number " + divisor + " is not divisor of the number " + number;
        }

        return result;
    }
}
