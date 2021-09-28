/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getYears()
    {
        App test = new App();

        int result = test.getYears(4);
        assertEquals(18, result);
    }

    @Test
    void isValidInput()
    {
        App test = new App();

        boolean result = test.isValidInput("abc");
        assertEquals(false, result);
        result = test.isValidInput("0");
        assertEquals(false, result);
        result = test.isValidInput("1");
        assertEquals(true, result);
    }
}