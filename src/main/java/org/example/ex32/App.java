/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex32;
import java.util.Scanner;

public class App
{
    public static boolean numGuess(double num)
    {
        Scanner scan = new Scanner(System.in);
        int numguess = 0;
        double guess = 0;
        boolean gameRunning = true;
        while(gameRunning) {
            boolean invalid = true;


            while (invalid)
            {
                String numGuess = scan.nextLine();
                try
                {
                    guess = Double.parseDouble(numGuess);
                } catch (Exception e)
                {
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }
                guess = Double.parseDouble(numGuess);
                invalid = false;
            }

            if (num > guess)
            {
                numguess++;
                System.out.print("Too low. Guess again ");
            } else if (num < guess)
            {
                numguess++;
                System.out.print("Too high. Guess again ");
            } else {
                numguess++;
                System.out.println(String.format("You got it in %d guesses!", numguess));
                gameRunning = false;
                System.out.print("Would you like to play again? (Y/N) ");
                String replay = scan.nextLine();
                if (replay.equals("y") || replay.equals("Y"))
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
        return true; //would not let me run the program without this despite already having 2 return statements
    }

    public static void playGame()
    {
        Scanner scan = new Scanner(System.in);
        boolean invalid = true;
        boolean replay = true;
        double randomNumber;
        double difficulty = 0;
        while(replay) {
            while (invalid) {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                String difficultyLevel = scan.nextLine();
                try {
                    difficulty = Double.parseDouble(difficultyLevel);
                } catch (Exception e) {
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }
                difficulty = Double.parseDouble(difficultyLevel);
                invalid = false;
            }
            difficulty = Math.pow(10.0, difficulty);
            randomNumber = Math.ceil(Math.random() * difficulty);
            System.out.println("I have my number. What is your guess?");
            replay = numGuess(randomNumber);
            if(replay == true)
            {
                invalid = true;
            }
        }
    }

    public static void main(String[] args)
    {
        playGame();
    }
}