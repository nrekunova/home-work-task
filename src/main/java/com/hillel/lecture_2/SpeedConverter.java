package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

    @Step
    public double speedKmToMi(double speedKm) {
        double result = speedKm * 0.6214;
        return result;
    }

    @Step
    public double speedMiToKm(double speedMi) {
        double result = speedMi / 0.6214;
        return result;
    }

}
