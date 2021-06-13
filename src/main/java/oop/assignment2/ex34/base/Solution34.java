package oop.assignment2.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution34
{
    public static void main(String[] args)
    {
        EmployeeList list = new EmployeeList();

        list.printlist();
        list.newlist(list.removeemployee());
        list.printnewlist();
    }
}
