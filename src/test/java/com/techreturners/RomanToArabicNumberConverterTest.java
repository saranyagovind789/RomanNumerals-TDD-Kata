package com.techreturners;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToArabicNumberConverterTest {


RomanToArabicNumberConverter romanNumerals = new RomanToArabicNumberConverter();
    @Test
    public void convertIto1(){
        int actual = romanNumerals.RomantoArabic("I");
        assertEquals(1,actual);
    }

    @Test
    public void convertIIto2(){
        int actual = romanNumerals.RomantoArabic("II");
        assertEquals(2,actual);
    }

    @Test
    public void convertIIIto3(){
        int actual = romanNumerals.RomantoArabic("III");
        assertEquals(3,actual);
    }

    @Test
    public void convertVto5(){
        int actual = romanNumerals.RomantoArabic("V");
        assertEquals(5,actual);
    }
}
