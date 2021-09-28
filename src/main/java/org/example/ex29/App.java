/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex29;
import java.util.Scanner;

public class App
{
    public static int getYears(int rate)
    {
        int years = (int) Math.ceil((double)72/rate);
        return years;
    }
    public static boolean isValidInput(String rateOfReturn)
    {
        int rate = 1;
        try
        {
             rate = Integer.parseInt(rateOfReturn);
        }
        catch (Exception e)
        {
            System.out.println("Sorry. That's not a valid input.");
            return false;
        }
        rate = Integer.parseInt(rateOfReturn);
        if(rate != 0)
        {
            return true;
        }
        else
        {
            System.out.println("Sorry. That's not a valid input.");
            return false;
        }
    }
    public static void main(String[] args)
    {
        int rate = 1;
        Scanner scan = new Scanner(System.in);
        boolean invalid = false;
        while(!invalid)
        {
            System.out.print("What is the rate of return? ");
            String ror = scan.nextLine();
            invalid = isValidInput(ror);
        }
        int years = getYears(rate);
        System.out.println("It will take "+years+" years to double your initial investment");
    }
}