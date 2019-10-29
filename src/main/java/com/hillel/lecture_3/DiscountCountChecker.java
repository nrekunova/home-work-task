package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {


        double result = 0.0;
        if (price > 1000.0) {
            result = price * 0.85;
            System.out.println("сумма покупки с учетом скидки " + result + " рублей");
        } else {
            System.out.println("скидка не предоставляется");
        }
        return result;
    }
}
