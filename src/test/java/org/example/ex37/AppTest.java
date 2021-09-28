/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generatePassword()
    {
        App test = new App();

        String Password;
        Password = test.generatePassword(test.getNumbers(2),test.getSpecials(2),test.getLetters(8,2,2));
        int numbers=0,specials=0,letters=0;

        for (int i = 0; i <Password.length(); i++)
        {
            if (Character.isDigit(Password.charAt(i)))
            {
                numbers++;
            }
            else if (Character.isAlphabetic(Password.charAt(i)))
            {
                letters++;
            }
            else
            {
                specials++;
            }
        }

        assertEquals(2,numbers);
        assertEquals(2,specials);
        assertEquals(4,letters);

    }
}