/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex32;
import java.util.Scanner;

public class App
{
    public static boolean playGame()
    {
        Scanner scan = new Scanner(System.in);
        boolean invalid = true;
        double difficulty = 0;
        while(invalid)
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String difficultyLevel = scan.nextLine();
            try
            {
                difficulty = Double.parseDouble(difficultyLevel);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            difficulty = Double.parseDouble(difficultyLevel);
            invalid = false;
        }
        difficulty = Math.pow(10.0,difficulty);
        double randomNumber = Math.random()*difficulty;
    }

    public static void main(String[] args)
    {
        boolean playAgain = true;
        while(playAgain)
        {
            playAgain = playGame();
        }
    }
}