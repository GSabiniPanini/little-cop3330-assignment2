package oop.assignment2.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution33
{
    public static void main(String[] args)
    {
        MagicBall mb = new MagicBall();

        mb.askquestion();
        String output = mb.generateoutput(mb.getrandomnumber());

        System.out.println(output);
    }
}
