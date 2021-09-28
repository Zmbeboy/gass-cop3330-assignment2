/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff()
    {
        PaymentCalculator test = new PaymentCalculator();
        int result = test.calculateMonthsUntilPaidOff(0.12,5000,100);
        assertEquals(70,result);
    }
}