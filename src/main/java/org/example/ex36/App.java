/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex36;
import java.util.*;

public class App
{
    public static boolean isNumeric(String str)
    {
        try
        {
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    public static double average(List<Integer>nums)
    {
        int total = 0;
        for(int i = 0; i < nums.size();i++)
        {
        total += nums.get(i);
        }
        return (double)total/nums.size();
    }
    public static int max(List<Integer>nums)
    {
        int max = nums.get(0);
        for(int i = 1; i < nums.size();i++)
        {
            if(max < nums.get(i))
            {
                max = nums.get(i);
            }
        }
        return max;
    }
    public static int min(List<Integer>nums)
    {
        int min = nums.get(0);
        for(int i = 1; i < nums.size();i++)
        {
            if(min > nums.get(i))
            {
                min = nums.get(i);
            }
        }
        return min;
    }
    public static double std(List<Integer>nums)
    {
        List<Double> squaredDifferences = new ArrayList<Double>();
        double average = average(nums);
        double total = 0;

        for(int i = 0; i < nums.size();i++)
        {
            squaredDifferences.add(Math.pow((double)nums.get(i)-average,2));
        }
        for(int i = 0; i < squaredDifferences.size();i++)
        {
            total += squaredDifferences.get(i);
        }
        total = total/squaredDifferences.size();
        return Math.sqrt(total);
    }
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        String tempNum;
        boolean input = true;
        while(input)
        {
            System.out.print("Enter a number: ");
            tempNum = scan.nextLine();
            if(tempNum.equals("done"))
            {
                input = false;
            }
            else if(isNumeric(tempNum))
            {
                nums.add(Integer.parseInt(tempNum));
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        System.out.print("Numbers: ");
        for(int i = 0; i<nums.size();i++)
        {
            System.out.print(nums.get(i));
            if(i != nums.size()-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("\nThe average is "+average(nums));
        System.out.println("The minimum is "+min(nums));
        System.out.println("The maximum is "+max(nums));
        System.out.println(String.format("The standard deviation is %.2f",std(nums)));
    }
}