package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

        int result = values[0];
        for (int val : values) {
            if (val < result) {
                result = val;
            }
        }

//        for (int i = 0; i < values.length; i++) {
//            if (values[i] < result) {
//                result = values[i];
//            }
//        }

        return result;
    }

}
