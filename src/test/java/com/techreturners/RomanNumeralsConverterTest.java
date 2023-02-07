package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void convertOnetoNumeral(){
        //act
        RomanNumeralsConverter romanObject = new RomanNumeralsConverter();
        //arrange
        int digit =1;
        String actual = romanObject.integerToRoman(digit);
        //assert
        assertEquals("I", actual);
       // assertEquals("I",romanNumeralsConverter.convert(1));
    }

    @Test
    public void convertSeventoNumeral(){
        //act
        RomanNumeralsConverter romanObject = new RomanNumeralsConverter();
        //arrange
        int digit =7;
        String actual = romanObject.integerToRoman(digit);
        //assert
        assertEquals("VII", actual);

    }

    @Test
    public void convertFourtoNumeral(){
        //act
        RomanNumeralsConverter romanObject = new RomanNumeralsConverter();
        //arrange
        int digit =4;
        String actual = romanObject.integerToRoman(digit);
        //assert
        assertEquals("IV", actual);
    }

    @Test
    public void convertFourNinetyNinetoNumeral(){
        //act
        RomanNumeralsConverter romanObject = new RomanNumeralsConverter();
        //arrange
        int digit =499;
        String actual = romanObject.integerToRoman(digit);
        //assert
        assertEquals("CDXCIX", actual);
    }


    @Test
    public void convertThreeThousandtoNumeral(){
        //act
        RomanNumeralsConverter romanObject = new RomanNumeralsConverter();
        //arrange
        int digit =3000;
        String actual = romanObject.integerToRoman(digit);
        //assert
        assertEquals("MMM", actual);
    }

    @Test
    public void convertThreeThousandTentoNumeral(){
        //act
        RomanNumeralsConverter romanObject = new RomanNumeralsConverter();
        //arrange
        int digit =3010;
        String actual = romanObject.integerToRoman(digit);
        String expected = "Number should be between 1 and 3000";
        //assert
        assertEquals(expected, actual);
    }
}
