/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex25;

import org.example.ex25.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void hasNumbers()
    {
        App test = new App();

        String input = "12345";
        String input2 = "john";
        boolean result = test.hasNumbers(input);
        assertEquals(true, result);

        result = test.hasNumbers(input2);
        assertEquals(false, result);
    }

    @Test
    void hasletters()
    {
        App test = new App();

        String input = "12345";
        String input2 = "john";
        boolean result = test.hasletters(input);
        assertEquals(false, result);

        result = test.hasletters(input2);
        assertEquals(true, result);
    }

    @Test
    void hasSpecials()
    {
        App test = new App();

        String input = "12345";
        String input2 = "hello@";
        boolean result = test.hasSpecials(input);
        assertEquals(false, result);

        result = test.hasSpecials(input2);
        assertEquals(true, result);
    }

    @Test
    void passwordValidator()
    {
        App test = new App();

        String input = "12345";
        String input2 = "abcdef";
        String input3 = "abc123xyz";
        String input4 = "1337h@xor";
        int result = test.passwordValidator(input);
        assertEquals(1,result);
        result = test.passwordValidator(input2);
        assertEquals(2,result);
        result = test.passwordValidator(input3);
        assertEquals(3,result);
        result = test.passwordValidator(input4);
        assertEquals(4,result);
    }
}