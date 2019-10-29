package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

        char[] reverse = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            reverse[i] = value.charAt(value.length() - (i +1));
        }
        String result = new String(reverse);

        return result;
    }

}
