/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void firstNameValidate()
    {
        App test = new App();

        String input = "Eric";
        String input2 = "E";
        String input3 = "";
        String result = test.firstNameValidate(input,"");
        assertEquals("", result);

        String result2 = test.firstNameValidate(input2,"");
        assertEquals("The first name must be at least 2 characters long.\n", result2);

        String result3 = test.firstNameValidate(input3,"");
        assertEquals("The first name must be at least 2 characters long.\nThe first name must be filled in.\n", result3);
    }

    @Test
    void lastNameValidate()
    {
        App test = new App();

        String input = "Eric";
        String input2 = "E";
        String input3 = "";
        String result = test.lastNameValidate(input,"");
        assertEquals("", result);

        String result2 = test.lastNameValidate(input2,"");
        assertEquals("The last name must be at least 2 characters long.\n", result2);

        String result3 = test.lastNameValidate(input3,"");
        assertEquals("The last name must be at least 2 characters long.\nThe last name must be filled in.\n", result3);
    }

    @Test
    void EIDValidate()
    {
        App test = new App();

        String input = "AA-1234";
        String input2 = "AAA-1243";
        String result = test.EIDValidate(input,"");
        assertEquals("", result);

        String result2 = test.EIDValidate(input2,"");
        assertEquals("The Employee ID must be in the format of AA-1234\n", result2);

    }

    @Test
    void ZIPValidate()
    {
        App test = new App();

        String input = "12345";
        String input2 = "a12n3";
        String result = test.ZIPValidate(input,"");
        assertEquals("", result);

        String result2 = test.ZIPValidate(input2,"");
        assertEquals("The zipcode must be a five digit number\n", result2);
    }
}