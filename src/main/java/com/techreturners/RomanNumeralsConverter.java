package com.techreturners;

import java.util.HashMap;

public class RomanNumeralsConverter {
    private static final int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String numerals[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public static String integerToRoman(int value) {
        if (value > 3000 || value < 1) {
            return "Number should be between 1 and 3000";
        }

            StringBuilder numeral = new StringBuilder();

            int index = 0;
            while (value > 0) {
                if (value - values[index] >= 0) {
                    numeral.append(numerals[index]);
                    value -= values[index];
                } else {
                    index++;
                }
            }
           // return numeral.toString();

        return numeral.toString();
    }

}
