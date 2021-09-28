/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex40;

import org.junit.jupiter.api.Test;

import java.util.*;

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
    void searchMap()
    {
        App test = new App();
        List<Map<String, String>> foundMaps = new ArrayList<Map<String, String>>();
        List<Map<String, String>> Expected = new ArrayList<Map<String, String>>();
        Map<String,String> map = new HashMap<String,String>();
        Map<String,String> map1 = new HashMap<String,String>();

        map = test.addToMap("Jake","Jacobson","Programmer","",map);
        Expected.add(map);
        map1 = test.addToMap("Jacquelyn","Jackson","DBA","",map1);
        Expected.add(map1);

        foundMaps = test.searchMap("Jac",test.createMaps());

        assertEquals(true,foundMaps.get(0).equals(Expected.get(0)));
        assertEquals(true,foundMaps.get(1).equals(Expected.get(1)));
    }

    @Test
    void createMaps()
    {
        App test = new App();
        assertEquals(false,test.createMaps().equals(Collections.<Map<String,String>>emptyList()));
    }
}