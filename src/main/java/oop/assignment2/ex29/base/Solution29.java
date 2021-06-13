package oop.assignment2.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution29
{
    public static void main(String[] args)
    {
        InputLoop il = new InputLoop();

        il.badinputloop();
        il.compute();
        String output = il.getoutput();

        System.out.println(output);
    }
}
