/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex39;
import java.util.*;

public class App
{
    public static Map<String,String> addToMap(String FirstName, String LastName,String Position, String Date, Map<String,String> map)
    {
        map.put("First Name", FirstName);
        map.put("Last Name", LastName);
        map.put("Position", Position);
        map.put("Separation Date", Date);
        return map;
    }

    public static List<Map<String,String>> createMaps()
    {
        List<Map<String, String>> maps = new ArrayList<Map<String, String>>();

        Map<String, String> map1 = new HashMap<String, String>();
        map1 = addToMap("John","Johnson","Manager","2016-12-31", map1);

        Map<String, String> map2 = new HashMap<String, String>();
        map2 = addToMap("Tou","Xiong","Software Engineer","2016-10-05", map2);

        Map<String, String> map3 = new HashMap<String, String>();
        map3 = addToMap("Michaela","Michaelson","District Manager","2015-12-19", map3);

        Map<String, String> map4 = new HashMap<String, String>();
        map4 = addToMap("Jake","Jacobson","Programmer","", map4);

        Map<String, String> map5 = new HashMap<String, String>();
        map5 = addToMap("Jacquelyn","Jackson","DBA","", map5);

        Map<String, String> map6 = new HashMap<String, String>();
        map6 = addToMap("Sally","Weber","Web Developer","2015-12-18", map6);

        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        maps.add(map5);
        maps.add(map6);

        return maps;
    }

    public static List<Map<String,String>> sortList(List<Map<String, String>> maps)
    {
        Collections.sort(maps,mapComparator);
        return maps;
    }

    public static void main(String[] args)
    {
        List<Map<String, String>> maps = new ArrayList<Map<String, String>>();

        maps = createMaps();

        maps = sortList(maps);

        System.out.println("Name                | Position          | Separation Date\n--------------------|-------------------|----------------");
        Map<String, String> map;

        for (int j=0; j<maps.size(); j++)
        {
            map = maps.get(j);
            String fname = map.get("First Name");
            String lname = map.get("Last Name");
            String Name = fname + " " + lname;
            String pos = map.get("Position");
            String sdate = map.get("Separation Date");
            System.out.format("%-20s| %-18s| %s\n",Name,pos,sdate);

        }
    }
    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> m1, Map<String, String> m2) {
            return m1.get("Last Name").compareTo(m2.get("Last Name"));
        }
    };
}