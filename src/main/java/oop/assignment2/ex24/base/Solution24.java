package oop.assignment2.ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution24
{

    public static void main(String[] args) {
        AnagramChecker ac = new AnagramChecker();
        Solution24 myApp = new Solution24();

        ac.readstrings();
        String output = ac.generateoutput(ac.isanagram());
        System.out.println(output);
    }

}
