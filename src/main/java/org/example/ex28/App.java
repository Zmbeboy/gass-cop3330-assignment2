/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex28;
import java.util.Scanner;

public class App
{
    public static int getTotal(int[]numArray)
    {
        int total=0;
        for(int i =0; i < numArray.length; i++)
        {
            total += numArray[i];
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[]numArray = new int[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            numArray[i] = scan.nextInt();
        }
        int total = getTotal(numArray);
        System.out.println("The total is "+total+".");
    }
}