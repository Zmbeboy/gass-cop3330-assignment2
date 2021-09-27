/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex35;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        List<String> employees = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String tempName;
        boolean input = true;
        while(input)
        {
            System.out.print("Enter a name: ");
            tempName = scan.nextLine();
            if(tempName.isEmpty())
            {
                input = false;
            }
            else
            {
                employees.add(tempName);
            }
        }

        int random = (int)(Math.random()*employees.size());
        System.out.println("The winner is: "+employees.get(random));
    }
}