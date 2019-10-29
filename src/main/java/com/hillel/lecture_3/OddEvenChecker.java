package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {


    public String checkNumber(int number) {


        String result = "";
        if ((number % 2) != 0) {
            result = "Odd Number";
        } else {
            result = "Even Number";
        }
        System.out.println("BYE");
        return result;
    }
}
