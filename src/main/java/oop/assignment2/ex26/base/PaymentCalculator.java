package oop.assignment2.ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class PaymentCalculator
{
    private static final Scanner in = new Scanner(System.in);

    public double bal;
    public double mp;
    public double APR;
    //mp = monthly payment

    public void readinput()
    {
        System.out.print("What is your balance? ");
        this.bal = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        this.APR = (in.nextDouble() / 100.000000);
        System.out.print("What is the monthly payment you can make? ");
        this.mp = in.nextDouble();
    }

    public int calculateMonthsUntilPaidOff()
    {
        System.out.println("bal: " + this.bal);
        System.out.println("mp: " + this.mp);
        System.out.println("APR: " + this.APR);
        double i = this.APR / 365;
        System.out.println("i: " + i);
        double y = Math.pow((1.0 + i), 30);
        System.out.println("y: " + y);
        double doublemonth = -(1.00 / 30.00) * Math.log(1.00 + (this.bal / this.mp) * (1.00 - y)) / Math.log(1.00 + i);
        int month = (int) doublemonth;
        if(month / 1 > 0)
            month += 1;

        return month;
    }

    public String getOutput(int months)
    {
        String output = ("It will take you " + months + " months to pay off this card.");
        return output;
    }
}
