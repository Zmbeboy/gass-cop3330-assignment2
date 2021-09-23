/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex25;
import java.util.Scanner;

public class App
{
    public static boolean hasNumbers(String str)
    {
        for (char c : str.toCharArray())
        {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    public static boolean hasletters(String str)
    {
        for (char c : str.toCharArray())
        {
            if (Character.isAlphabetic(c)) return true;
        }
        return false;
    }

    public static boolean hasSpecials(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isAlphabetic(c)&&!Character.isDigit(c)) return true;
        }
        return false;
    }

    public static int passwordValidator(String password)
    {
        int result = 0;
        boolean hasNum, hasLetter, hasSpecial;

        hasNum = hasNumbers(password);
        hasLetter = hasletters(password);
        hasSpecial = hasSpecials(password);

        if(password.length() < 8)
        {
            if(hasNum == true && hasLetter == false && hasSpecial==false)
            {
                result = 1;
            }
            else if(hasNum == false && hasLetter == true && hasSpecial==false)
            {
                result = 2;
            }
        }
        else
        {
            if(hasNum == true && hasLetter == true && hasSpecial==false)
            {
                result = 3;
            }
            else if(hasNum == true && hasLetter == true && hasSpecial==true)
            {
                result = 4;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int result;
        String strength;
        //Gather inputs in string form
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scan.nextLine();
        result = passwordValidator(password);

        switch(result)
        {
            case 1: strength = "very weak";
                break;
            case 2: strength = "weak";
                break;
            case 3: strength = "strong";
                break;
            case 4: strength = "very strong";
                break;
            default: strength = "undefined";
                break;
        }
        System.out.println(String.format("The password (%s) is a %s password.",password,strength));
    }

}