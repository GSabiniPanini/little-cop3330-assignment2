package oop.assignment2.ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution26
{
    public static void main(String[] args)
    {
        PaymentCalculator fc = new PaymentCalculator();

        fc.readinput();
        int months = fc.calculateMonthsUntilPaidOff();
        String output = fc.getOutput(months);

        System.out.println(output);
    }
}
