package oop.assignment2.ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution35
{
    public static void main(String[] args)
    {
        Winner myApp = new Winner();

        myApp.readnames();
        String winner = myApp.getwinner(myApp.getrandomnumber());
        System.out.println(winner);
    }
}
