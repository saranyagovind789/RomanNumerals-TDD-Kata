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
        String actual = romanObject.convert(digit);
        //assert
        assertEquals("I", actual);
       // assertEquals("I",romanNumeralsConverter.convert(1));

    }
}
