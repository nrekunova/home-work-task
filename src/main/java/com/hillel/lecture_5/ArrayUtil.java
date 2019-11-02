package com.hillel.lecture_5;

public class ArrayUtil {
    public int summa(int[] values) {
        int sum = 0;
        for (int num: values) {
            sum = sum + num;
        }
        return sum;
    }
    public int[] getCodes(char[] chars){
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i = i + 1){
            codes[i] = chars[i];
        }
        return codes;
    }
}
