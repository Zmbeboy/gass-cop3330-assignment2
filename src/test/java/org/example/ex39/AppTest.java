/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex39;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addToMap()
    {
        App test = new App();
        Map<String,String> finalResult = new HashMap<String,String>();
        finalResult.put("First Name", "Eric");
        finalResult.put("Last Name", "Gass");
        finalResult.put("Position", "CEO");
        finalResult.put("Separation Date", "");

        Map<String,String> map = new HashMap<String,String>();
        map = test.addToMap("Eric","Gass","CEO","",map);

        assertEquals(true,finalResult.equals(map));
    }

    @Test
    void createMaps()
    {
        App test = new App();
        assertEquals(false,test.createMaps().equals(Collections.<Map<String,String>>emptyList()));
    }
    //not testing createMaps() as there is no varying input
}