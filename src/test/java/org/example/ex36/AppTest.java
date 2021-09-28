/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isNumeric()
    {
        App test = new App();

        boolean result = test.isNumeric("12345");
        assertEquals(true,result);

        result = test.isNumeric("1abc");
        assertEquals(false,result);
    }

    @Test
    void average()
    {
        App test = new App();

        List<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        double result = test.average(nums);
        assertEquals(400.0,result);
    }

    @Test
    void max()
    {
        App test = new App();

        List<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        double result = test.max(nums);
        assertEquals(1000,result);
    }

    @Test
    void min()
    {
        App test = new App();

        List<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        double result = test.min(nums);
        assertEquals(100,result);
    }

    @Test
    void std()
    {
        App test = new App();

        List<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        double result = test.std(nums);
        result = Math.round(result * 100.0) / 100.0;
        assertEquals(353.55,result);
    }
}