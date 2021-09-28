/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getResult()
    {
        App test = new App();

        List<String>Test = new ArrayList<>();
        Test.add("Eric Gass");
        Test.add("John Gass");
        Test.add("Eric John Gass");


        String result = test.getResult(Test);
        assertEquals("Eric Gass\nJohn Gass\nEric John Gass\n",result);

    }
}