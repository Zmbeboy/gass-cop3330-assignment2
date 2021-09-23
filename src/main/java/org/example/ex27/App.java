/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex27;
import java.util.Scanner;

public class App
{
    public static boolean firstNameValidate(String fname)
    {
        boolean result = true;
        if(fname.length() < 2)
        {
            System.out.println("The first name must be at least 2 characters long.");
            result = false;
        }
        if(fname == "")
        {
            System.out.println("The first name must be filled in.");
            result = false;
        }
        return result;
    }

    public static boolean lastNameValidate(String lname)
    {
        boolean result = true;
        if(lname.length() < 2)
        {
            System.out.println("The last name must be at least 2 characters long.");
            result = false;
        }
        if(lname == "")
        {
            System.out.println("The last name must be filled in.");
            result = false;
        }
        return result;
    }

    public static boolean EIDValidate(String EID)
    {
        boolean result = true;
        if(EID.length() != 7)
        {
            result = false;
        }
        char[] c = new char[EID.length()];
        c = EID.toCharArray();
        for(int i = 0; i < EID.length(); i++)
        {
            if(i < 2)
            {
                if(!Character.isAlphabetic(c[i]))
                {
                    result = false;
                }
            }
            if(i == 2)
            {
                if(c[i] != '-')
                {
                    result = false;
                }
            }
            if(i > 2)
            {
                if(!Character.isDigit(c[i]))
                {
                    result = false;
                }
            }
        }
        if(result == false)
        {
            System.out.println("The Employee ID must be in the format of AA-1234");
        }
        return result;
    }

    public static boolean ZIPValidate(String ZIP)
    {
        boolean result = true;
        if(ZIP.length() != 5)
        {
            result = false;
        }
        for(char c : ZIP.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                result = false;
            }
        }
        if(result == false)
        {
            System.out.println("The zipcode must be a five digit number");
        }
        return result;
    }

    public static void validateInput(String fname,String lname, String ZIP, String EID)
    {
        boolean fNameRes = firstNameValidate(fname);
        boolean lNameRes = lastNameValidate(lname);
        boolean EIDRes = EIDValidate(EID);
        boolean ZIPRes = ZIPValidate(ZIP);


        if(fNameRes == true && lNameRes == true && ZIPRes == true && EIDRes == true)
        {
            System.out.println("There were no errors found.");
        }

    }

    public static void main(String[] args)
    {
        //Gather inputs in string form
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        String eid = scan.nextLine();

        validateInput(firstName,lastName,zip,eid);
    }
}