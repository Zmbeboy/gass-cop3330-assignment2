/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex30;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int num;
        for(int i = 1; i <= 12; i++)
        {
            for(int j = 1; j <= 12;j++)
            {
                num = i*j;
                System.out.print(String.format("%5d",num));
            }
            System.out.println("");
        }
    }
}