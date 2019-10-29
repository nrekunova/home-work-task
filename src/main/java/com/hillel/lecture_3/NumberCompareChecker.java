package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberCompareChecker {

    @Step
    public String getGreatestNumber(int a, int b) {


        String result = "";
        if (a == b) {
            result = "Numbers " + a + " and " + b + " are equals!";
        } else if (a > b) {
            result = "Number " + a + " has greatest value!";
        } else {
            result = "Number " + b + " has greatest value!";
        }

        return result;
    }
}
