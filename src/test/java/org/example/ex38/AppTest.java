/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers()
    {
        App test = new App();
        Integer[] result = new Integer[4];
        Integer[] evens = {2,4,6,8};
        String[] expected = {"2","4","6","8"};
        int[] nums = {1,2,3,4,5,6,7,8};

        result = test.filterEvenNumbers(nums);

        assertArrayEquals(evens,result);
    }

    @Test
    void filterString()
    {
        App test = new App();
        String input = "1 2 3 4 5 6 7 8";
        char[] result = test.filterString(input);

        char[] desiredResult = {'1','2','3','4','5','6','7','8'};

        assertArrayEquals(desiredResult,result);
    }
}