package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {


        int[] result = values;
        int t;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[i]) {
                    t = result[i];
                    result[i] = result[j];
                    result[j] = t;
                }
            }
        }
        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

        int[] result = values;
        int t;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] > result[i]) {
                    t = result[i];
                    result[i] = result[j];
                    result[j] = t;
                }
            }
        }
        return result;
    }
}
