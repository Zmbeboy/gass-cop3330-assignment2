/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex38;
import java.util.*;

public class App
{
    public static Integer[] filterEvenNumbers(int[]nums)
    {
        System.out.print("The even numbers are ");
        Integer[] evens;
        List<Integer> indexes = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                indexes.add(nums[i]);
            }
        }
        evens = indexes.toArray(new Integer[indexes.size()]);
        return evens;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scan.nextLine();
        String[] inputArray = input.split(" ");
        Integer[] evens;
        int[] nums = new int[inputArray.length];
        for( int i = 0; i < inputArray.length; i++)
        {
            nums[i] = Integer.parseInt(inputArray[i]);
        }
        evens = filterEvenNumbers(nums);
        for(int i = 0; i< evens.length;i++)
        {
            System.out.print(evens[i]+ " ");
        }
    }
}
