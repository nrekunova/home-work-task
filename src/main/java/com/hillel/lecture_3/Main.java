package com.hillel.lecture_3;

import com.hillel.lecture_5.ArrayUtil;
import com.hillel.lecture_5.EvenOrOddChecker;

public class Main {

    public static void main(String[] args) {
        // 1.
        double v1 = 10;
        double t1 = 100;
        double v2 = 20;
        double t2 = 36.6;

        double vo = v1 + v2;
        double to = (t1 * v1 + t2 * v2)/ (v1 + v2);
        System.out.println("Объем смеси = " + vo + "; температура смеси = " + to);

        // 2.
        double uah = 1000.50;
        double pound = uah * 0.031;
        double usd = uah * 0.040;
        double euro = uah * 0.036;
        double rub = uah * 2.56;

        System.out.println( uah + " UAH = "  + pound + " POUND, " + usd + " USD, " + euro + " EURO, " + rub + " RUB");


        // 3.
        int a = 2;
        a = a * a;
        a = a * a;
        System.out.println("a в 4 степени = " + a);
        int b = 2;
        b = b * b * b;
        b = b * b;
        System.out.println("b в 6 степени = " + b);

        // 4.
        int a4 = 1;
        int b4 = 2;
        int c4 = 0;
        a4 = a4 + b4;
        b4 = a4 - b4;
        a4 = a4 - b4;
        System.out.println("a = " + a4 + ", b = " + b4);

        c4 = a4;
        a4 = b4;
        b4 = c4;
        System.out.println("a = " + a4 + ", b = " + b4);


        EvenOrOddChecker evenOrOddChecker = new EvenOrOddChecker();
        System.out.println("numer = " + 2 + " is even : " + evenOrOddChecker.check(2));
        System.out.println("numer = " + 7 + " is even : " + evenOrOddChecker.check(7));

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] argg = {1, 3, 5};
        System.out.println("Summ of array[1, 3, 5] = " + arrayUtil.summa(argg));
        char[] chars = {'A', 'B', 'C'};
        System.out.println("array = " + chars + " codes = " + arrayUtil.getCodes(chars));


    }
}
