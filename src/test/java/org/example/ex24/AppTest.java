/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex24;

import org.example.ex24.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void areAnagrams()
    {
        App test = new App();
        char[] input = new char[4];
        String word1 = "john";
        char[] input2 = new char[4];
        String word2 = "jhon";

        input = word1.toCharArray();
        input2 = word2.toCharArray();

        boolean result;
        result = test.areAnagrams(input, input2);
        assertEquals(true, result);

        word1 = "Doesnt";
        word2 = "Work";

        input = word1.toCharArray();
        input2 = word2.toCharArray();

        result = test.areAnagrams(input, input2);
        assertEquals(false, result);
    }
}