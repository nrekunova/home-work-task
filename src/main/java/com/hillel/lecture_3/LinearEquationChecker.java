package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public int linearEquation(int a, int b) {


        int result = 0;
        if (a != 0 && b != 0) {
            result = - b / a;
        }
        System.out.println("X = " + result);
        return result;
    }
}
