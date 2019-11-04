package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {
        sentence = sentence.replace(".", "").replace(",", "");
        String[] words = sentence.split(" ");

        int result = 0;
        for (String word : words) {
            if (word.length() == wordLength) {
                result = result + 1;
            }

        }

        return result;
    }


}
