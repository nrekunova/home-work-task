package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {


        String result = word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {


        String result = word.toLowerCase();


        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {


        String result = "";
        String[] sentences = sentence.split("\\. ");
        String sen = firstLetterToUpperCase(sentences[0]);
        result = sen;
        for(int i = 1; i < sentences.length; i++){
            result = result + ". ";
            sen = firstLetterToUpperCase(sentences[i]);
            result = result + sen;
        }

        return result;
    }

    public String firstLetterToUpperCase(String text){
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

        String result = "";
        String[] words = sentence.split(" ");
        String word = firstLetterToUpperCase(words[0]);
        result = word;
        for(int i = 1; i < words.length; i++){
            result = result + " ";
            word = firstLetterToUpperCase(words[i]);
            result = result + word;
        }

        return result;
    }
}
