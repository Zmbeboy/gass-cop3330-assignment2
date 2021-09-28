/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void randomGet() {
        App test = new App();

        for (int i = 0; i < 10; i++) {
            int result = test.randomGet(5);
            assertEquals(true, (result <= 4 && result >= 0));
            result = test.randomGet(10);
            assertEquals(true, (result <= 9 && result >= 0));
            result = test.randomGet(15);
            assertEquals(true, (result <= 14 && result >= 0));
        }
    }
}