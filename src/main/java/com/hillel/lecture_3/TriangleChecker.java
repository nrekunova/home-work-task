package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    public String isTriangleIsosceles(int a, int b, int c) {

// изменения в тестовых данных, добавлен "!" в двух результатах
        String result = "";
        if (a == b || b == c || a == c) {
            result = "Isosceles triangle!";
        } else {
            result = "No isosceles triangle!";
        }
        return result;
    }
}
