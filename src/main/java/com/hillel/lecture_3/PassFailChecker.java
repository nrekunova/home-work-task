package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    public String checkNumber(int number) {


        String result = "";
        if (number >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";

        }
        System.out.println("DONE");
        return result;
    }
}
