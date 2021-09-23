/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example.ex26;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        int result;
        String strength;
        int months;
        //Gather inputs in string form
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your balance: ");
        double balance = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent): ");
        double APR = scan.nextDouble();
        System.out.print("What is the monthly payment you can make: ");
        double MonthlyPayment = scan.nextDouble();

        APR = APR/100;

        PaymentCalculator Calculator = new PaymentCalculator();
        months = Calculator.calculateMonthsUntilPaidOff(APR,balance,MonthlyPayment);
        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}

class PaymentCalculator
{
    public static int calculateMonthsUntilPaidOff(double APR, double balance, double monthlyPayment)
    {
        APR = APR/365;
        double n = (-1.0/30.0) * Math.log(1.0+(balance/monthlyPayment) * (1.0- (Math.pow(1.0+APR,30.0)))) / Math.log(1.0+APR);
        int result = (int) Math.ceil(n);
        return result;
    }
}