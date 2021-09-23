/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        //gathers inputs in string form
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams ");
        System.out.print("Enter the first string: ");
        String string1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scan.nextLine();

        //creates char arrays to store the strings
        char[] word1 = new char[string1.length()];
        char[] word2 = new char[string2.length()];

        for(int i = 0; i <string1.length(); i++) //loops through each char in a string and assigns it into the array
        {
            word1[i] = string1.charAt(i);
        }
        for(int j = 0; j <string2.length(); j++) //loops through each char in a string and assigns it into the array
        {
            word2[j] = string2.charAt(j);
        }
        //sort the characters
        Arrays.sort(word1);
        Arrays.sort(word2);

        //if the strings are the same length compare each character
        if(string1.length() == string2.length())
        {
            for (int k = 0; k <string1.length();k++)
            {
                if(word1[k]!=word2[k]) //if the characters aren't equal, output they aren't anagrams and exit the program.
                {
                    System.out.println(String.format("%s and %s are NOT anagrams.",string1,string2));
                    System.exit(1);
                }
            }
        }
        else//if they arent equal lengths strings exit out
        {
            System.out.println(String.format("%s and %s are NOT anagrams.",string1,string2));
            System.exit(1);
        }
        System.out.println(String.format("%s and %s are anagrams.",string1,string2)); //output statement if the strings are anagrams
    }
}