/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex34;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        List<String> employees = new ArrayList<String>();

        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are 5 employees:");
        for(int i = 0; i<5;i++)
        {
            System.out.println(employees.get(i));
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter an employee name to remove: ");
        String remove = scan.nextLine();

        employees.remove(remove);

        System.out.println("\nThere are 4 employees:");
        for(int i = 0; i<4;i++)
        {
            System.out.println(employees.get(i));
        }
    }
}