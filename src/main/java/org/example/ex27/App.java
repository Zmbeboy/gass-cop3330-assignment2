/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex27;
import java.util.Scanner;

public class App
{
    public static String firstNameValidate(String fname,String output)
    {
        boolean result = true;
        if(fname.length() < 2)
        {
            output += "The first name must be at least 2 characters long.\n";
            result = false;
        }
        if(fname == "")
        {
            output +="The first name must be filled in.\n";
            result = false;
        }
        return output;
    }

    public static String lastNameValidate(String lname, String output)
    {
        boolean result = true;
        if(lname.length() < 2)
        {
            output += "The last name must be at least 2 characters long.\n";
            result = false;
        }
        if(lname == "")
        {
            output += "The last name must be filled in.\n";
            result = false;
        }
        return output;
    }

    public static String EIDValidate(String EID, String output)
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
            output+="The Employee ID must be in the format of AA-1234\n";
        }
        return output;
    }

    public static String ZIPValidate(String ZIP, String output)
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
            output +="The zipcode must be a five digit number\n";
        }
        return output;
    }

    public static void validateInput(String fname,String lname, String ZIP, String EID)
    {
        String output = "";
        output = firstNameValidate(fname,output);
        output = lastNameValidate(lname,output);
        output = EIDValidate(EID,output);
        output = ZIPValidate(ZIP,output);

        if(output == "")
        {
            output = "There were no errors found.";
        }

        System.out.println(output); //only output statement

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