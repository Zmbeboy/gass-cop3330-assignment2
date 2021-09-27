/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex33;
import java.util.*;

public class App
{
    public static int getRandom()
    {
        return (int)Math.ceil(Math.random()*4);
    }
    public static void main(String[] args)
    {
        List<String> Responses = new ArrayList<String>();

        Responses.add("Yes");
        Responses.add("No");
        Responses.add("Maybe");
        Responses.add("Ask again later.");

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your question?");
        String temp = scan.nextLine();

        int num = getRandom();

        System.out.println(Responses.get(num));
    }
}