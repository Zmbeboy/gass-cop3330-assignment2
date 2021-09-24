/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex31;
import java.util.Scanner;

public class App
{
    public static void generateChart(int pulse, int age)
    {
        double targetHeartRate = 0;
        char c = '%';
        System.out.println("Intensity    | Rate   ");
        System.out.println("-------------|--------");
        for(int intensity = 55; intensity <=95; intensity+=5)
        {
            targetHeartRate = (((220 - age) - pulse) * ((double)intensity/100))+ pulse;

            System.out.println(String.format("%d%c          | %3.0f bpm",intensity,c,targetHeartRate));
        }
    }
    public static void main(String[] args)
    {
        int pulse = 1, age = 1;
        Scanner scan = new Scanner(System.in);
        boolean invalid = true;
        while(invalid)
        {
            System.out.print("What is your resting pulse? ");
            String restingPulse = scan.nextLine();
            try
            {
                pulse = Integer.parseInt(restingPulse);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            pulse = Integer.parseInt(restingPulse);
            invalid = false;
        }
        invalid = true;
        while(invalid)
        {
            System.out.print("What is your age? ");
            String userAge = scan.nextLine();
            try
            {
                age = Integer.parseInt(userAge);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            age = Integer.parseInt(userAge);
            invalid = false;
        }
        System.out.println("\nResting Pulse : "+pulse+"     Age:"+age+"\n");
        generateChart(pulse,age);
    }
}