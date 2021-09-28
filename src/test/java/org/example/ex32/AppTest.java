/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getRandomNumber()
    {
        App test = new App();

        for(int i = 0; i < 10; i++)
        {
        int result = test.getRandomNumber(1);
        assertEquals(true,(result<=10&&result>=1));
        result = test.getRandomNumber(2);
        assertEquals(true,(result<=100&&result>=1));
        result = test.getRandomNumber(3);
        assertEquals(true,(result<=1000&&result>=1));
        }

    }
}