package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {


    public String checkCircleInSquare(double circleArea, double squareArea) {

        double r = Math.sqrt(circleArea / Math.PI);
        double a = Math.sqrt(squareArea);
        String result = "";
        if (2 * r <= a) {
            result = "The circle is in the square";
        } else {
            result = "The circle is not in the square";
        }
        return result;
    }

    public String checkSquareInCircle(double circleArea, double squareArea) {
// Please, fix testdata "The square is in the square";
        double r = Math.sqrt(circleArea / Math.PI);
        double a = Math.sqrt(squareArea);
        double di = a / Math.sqrt(2);
        String result = "";
        if (di <= r) {
            result = "The square is in the circle";
        } else {
            result = "The square is not in the circle";
        }
        return result;
    }

}
