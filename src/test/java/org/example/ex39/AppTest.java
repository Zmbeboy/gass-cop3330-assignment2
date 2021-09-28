/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */
package org.example.ex39;

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
    void createMaps()
    {
        App test = new App();
        assertEquals(false,test.createMaps().equals(Collections.<Map<String,String>>emptyList()));
    }

    @Test
    void sortList()
    {
        App test = new App();
        List<Map<String,String>> expected = new ArrayList<Map<String, String>>();
        List<Map<String,String>> result = new ArrayList<Map<String, String>>();
        Map<String,String> map1 = new HashMap<String, String>();
        Map<String,String> map2 = new HashMap<String, String>();
        Map<String,String> map3 = new HashMap<String, String>();
        Map<String,String> map4 = new HashMap<String, String>();
        Map<String,String> map5 = new HashMap<String, String>();
        Map<String,String> map6 = new HashMap<String, String>();

        map1 = test.addToMap("Jacquelyn","Jackson","DBA","",map1);
        map2 = test.addToMap("Jake","Jacobson","Programmer","",map2);
        map3 = test.addToMap("John","Johnson","Manager","2016-12-31",map3);
        map4 = test.addToMap("Michaela","Michaelson","District Manager","2015-12-19",map4);
        map5 = test.addToMap("Sally","Weber","Web Developer","2015-12-18",map5);
        map6 = test.addToMap("Tou","Xiong","Software Engineer","2016-10-05",map6);


        expected.add(map1);
        expected.add(map2);
        expected.add(map3);
        expected.add(map4);
        expected.add(map5);
        expected.add(map6);
        result = test.sortList(test.createMaps());

        assertEquals(true, expected.get(0).equals(result.get(0)));
        assertEquals(true, expected.get(1).equals(result.get(1)));
        assertEquals(true, expected.get(2).equals(result.get(2)));
        assertEquals(true, expected.get(3).equals(result.get(3)));
        assertEquals(true, expected.get(4).equals(result.get(4)));
        assertEquals(true, expected.get(5).equals(result.get(5)));
    }
}