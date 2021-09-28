/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getRandom()
    {
        App test = new App();

        for(int i = 0; i < 10; i++)
        {
            int result = test.getRandom();
            assertEquals(true, (result <= 4 && result >= 1));
        }
    }
}