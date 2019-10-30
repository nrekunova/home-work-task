package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {

    @Step
    public double celsiusToFahrenheit(double celsius) {
        double result = celsius * 9.0/5.0 + 32;
        return result;
    }

    @Step
    public double fahrenheitToCelsius(double fahrenheit) {

        double result = (5.0/9) * (fahrenheit - 32);
        return result;
    }

    @Step
    public double celsiusToKelvin(double celsius) {

        double result = celsius + 273.16;
        return result;
    }
}
