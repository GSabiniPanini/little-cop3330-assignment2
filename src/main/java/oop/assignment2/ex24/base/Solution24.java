package oop.assignment2.ex24.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class Solution24 {

    public static void main(String[] args) {
        AnagramChecker ac = new AnagramChecker();
        Solution24 myApp = new Solution24();

        ac.readstrings();
        String output = ac.generateoutput(ac.isanagram());
        System.out.println(output);
    }

}
