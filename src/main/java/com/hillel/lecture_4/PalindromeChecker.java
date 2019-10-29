package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {


        boolean result = true;
        int len = value.length();
        for (int i = 0; i < len / 2; i++) {
            if (value.charAt(i) != value.charAt(len - (i + 1))) {
                return false;
            }
        }
        return result;
    }

}
