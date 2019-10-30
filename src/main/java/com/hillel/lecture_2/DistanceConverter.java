package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {

        double result = meters * 39.37;
        return result;
    }

    @Step
    public double inchesToMeters(double inches) {
        double result = inches / 39.37;
        return result;
    }

    @Step
    public double milesToKilometres(double miles) {
        double result = miles * 1.609;
        return result;
    }

    @Step
    public double kilometresToMiles(double kilometres) {
        double result = kilometres / 1.609;
        return result;
    }
}
