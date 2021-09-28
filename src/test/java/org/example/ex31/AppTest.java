/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void heartRate()
    {
        App test = new App();

        double result = test.heartRate(22,65,55);
        assertEquals(138, (int)result);
    }
}