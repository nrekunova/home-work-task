package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

        String[] parts = code.split(" ");
        String nums = "";
        for (char letter: parts[0].toCharArray()) {
            if (letter >= '0' && letter <= '9') {
                nums = nums + letter;
            } else if (letter < 'A' || letter > 'Z') {
                return false;
            }
        }
        if (nums.length() != 6) {
            return false;
        }
        int n1 = Integer.valueOf(nums.substring(0, 2));
        int n2 = Integer.valueOf(nums.substring(2, 4));
        int n3 = Integer.valueOf(nums.substring(4));
        int total = Integer.valueOf(parts[1]);

        return n1*n2*n3 == total;
    }
}
