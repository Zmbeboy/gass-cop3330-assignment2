/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex29;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int rate = 1;
        Scanner scan = new Scanner(System.in);
        boolean invalid = true;
        while(invalid)
        {
            System.out.print("What is the rate of return? ");
            String ror = scan.nextLine();
            try
            {
                rate = Integer.parseInt(ror);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            rate = Integer.parseInt(ror);
            if(rate != 0)
            {
                invalid = false;
            }
            else
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        int years = (int) Math.ceil((double)72/rate);
        System.out.println("It will take "+years+" years to double your initial investment");
    }
}