package oop.assignment2.ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution27
{
    public static void main(String[] args)
    {
        EmployeeInfo ei = new EmployeeInfo();

        ei.readdata();
        int counter = ei.validateInput(ei.fname, ei.lname, ei.zip, ei.id);

        String output = ei.getoutput();
        System.out.println(output);
    }
}
