package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    // "Two real, identical roots: [x1 && x2] = -54.0") ; - неправильный тест
    public String checkQuadraticEquation(double a, double b, double c) {

        String result = "";
        if (a == 0.0) {
            result = "The 'a' coefficient should not be zero!";
        } else {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                result = "No roots on the set of real numbers!";
            } else if (d == 0.0) {
                double x = -b / (2 * a);
                result = "Two real, identical roots: [x1 && x2] = " + x;
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d))/ (2 * a);
                result = String.format("Discriminant: %s, x1: %s, x2: %s", d, x1, x2);
            }
        }

        return result;
    }

}
