package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {
        int num = 0;
//        for (int i = 0; i < text.length(); i++){
//
//            if (letter ==  text.charAt(i)){
//                num = num + 1;
//            }
//        }

        int idx = text.indexOf(letter);
        while (idx >= 0) {
            num++;
            text = text.substring(idx + 1);
            idx =text.indexOf(letter);
        }
        String result = "Character '" +  letter + "' repeated "+ num +" times";
        return result;
    }
}
