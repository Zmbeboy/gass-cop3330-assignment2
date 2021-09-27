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
        List<Integer> evenNums = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                evenNums.add(nums[i]);
            }
        }
        evens = evenNums.toArray(new Integer[evenNums.size()]);
        return evens;
    }
    public static char[] filterString(String input)
    {
        char[] chararray = new char[input.length()];
        char[] filteredArray = new char[input.length()];
        int j = 0;
        chararray = input.toCharArray();
        for(int i = 0; i<chararray.length;i++)
        {
            if(chararray[i]!=' ')
            {
                filteredArray[j] = chararray[i];
                j++;
            }
        }
        return filteredArray;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scan.nextLine();
        char[] inputArray = filterString(input);
        Integer[] evens;
        int[] nums = new int[inputArray.length];
        for( int i = 0; i < inputArray.length; i++)
        {
            nums[i] = Character.getNumericValue(inputArray[i]);
        }
        evens = filterEvenNumbers(nums);
        for(int i = 0; i< evens.length;i++)
        {
            System.out.print(evens[i]+ " ");
        }
    }
}
