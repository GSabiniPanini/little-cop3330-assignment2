package oop.assignment2.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution28
{
    public static void main(String[] args)
    {
        AddingLoop al = new AddingLoop();

        al.readinput();
        int sum = al.compute();
        System.out.println("The total is " + sum + ".");

    }
}
