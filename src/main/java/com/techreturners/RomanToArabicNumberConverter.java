package com.techreturners;

public class RomanToArabicNumberConverter {
    public static int RomantoArabic(String roman ){
        if(roman.equals("I")) {
            return 1;
        }
        if (roman.equals ("II")){
            return 2;
        }
        if (roman.equals ("III")){
            return 3;
        }
        if (roman.equals("V")){
            return 5;
        }
        else return -1;
    }
}
