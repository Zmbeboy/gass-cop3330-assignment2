/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex37;
import java.util.*;

public class App
{
    public static List<Character> getNumbers(int numOfNum)
    {
        List<Character>Numbers = new ArrayList<>();
        List<Character>nums = new ArrayList<>();
        Collections.addAll(Numbers,'0','1','2','3','4','5','6','7','8','9');
        for(int i=0; i < numOfNum; i++)
        {
            nums.add(Numbers.get((int)(Math.random()*10)));
        }
        return nums;
    }
    public static List<Character> getSpecials(int specials)
    {
        List<Character>Specials = new ArrayList<>();
        List<Character>spec = new ArrayList<>();
        Collections.addAll(Specials,' ','!','"','#','$','%','&',(char)39,'(',')','*','+',',','-','.','/',':',';','<','=','>','?','@','[',(char)92,']','^','_','`','{','}','|','~');
        for(int i=0; i < specials; i++)
        {
            spec.add(Specials.get((int)(Math.random()*33)));
        }
        return spec;
    }
    public static List<Character> getLetters(int length, int specials, int numOfNum)
    {
        List<Character>Letters = new ArrayList<>();
        List<Character>lets = new ArrayList<>();
        Collections.addAll(Letters,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        int totalLetters = specials+numOfNum;
        if(length-specials-numOfNum > totalLetters)
        {
            totalLetters = length-specials-numOfNum;
        }

        for(int i=0; i < totalLetters; i++)
        {
            lets.add(Letters.get((int)(Math.random()*26)));
        }
        return lets;
    }
    public static String generatePassword(List<Character>numbers,List<Character>specials,List<Character>letters)
    {
        List<Character>combined = new ArrayList<>();
        for(int i=0;i< numbers.size();i++)
        {
            combined.add(numbers.get(i));
        }
        for(int i=0;i< specials.size();i++)
        {
            combined.add(specials.get(i));
        }
        for(int i=0;i< letters.size();i++)
        {
            combined.add(letters.get(i));
        }
        Collections.shuffle(combined);
        String output = "";
        for(int i = 0; i < combined.size();i++)
        {
            output = output+combined.get(i);
        }
        return output;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = scan.nextInt();
        System.out.print("How many special characters? ");
        int special = scan.nextInt();
        System.out.print("How many numbers? ");
        int numOfNum = scan.nextInt();

        List<Character>numbers = getNumbers(numOfNum);
        List<Character>specials = getSpecials(special);
        List<Character>letters = getLetters(length,special,numOfNum);

        String password = generatePassword(numbers,specials,letters);
        System.out.println("Your password is "+password);
    }
}