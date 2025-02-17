package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static long rotate(long n) {
        System.out.println(n);
        String num = String.valueOf(n);
        long max = n;
        for (int i = 0; i < num.length() - 1; i++) {
            String unmodify = num.substring(0, i);
            String rotate = num.substring(i);
            num = unmodify + rotate.substring(1) + rotate.substring(0, 1);
            System.out.println(num);
            max = Math.max(max, Long.valueOf(num));
        }

        return max;
    }
}
