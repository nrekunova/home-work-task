package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker {

    @Step
    public int countNumberOfWorld(String sentence) {
        sentence = sentence.replace(".", "").replace(",", "");
        String[] words = sentence.split(" ");

        int result = words.length;
        return result;
    }
}
