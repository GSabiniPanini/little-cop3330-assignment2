package oop.assignment2.ex24.base;

import java.util.Arrays;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class AnagramChecker {
    private static final Scanner in = new Scanner(System.in);

    public String s1;
    public String s2;

    void readstrings()
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        this.s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        this.s2 = in.nextLine();
    }

    public boolean isanagram()
    {
        boolean flag;
        if(this.s1.length() == this.s2.length())
        {
            char[] As1 = s1.toLowerCase().toCharArray();
            char[] As2 = s2.toLowerCase().toCharArray();
            Arrays.sort(As1);
            Arrays.sort(As2);

            flag = Arrays.equals(As1, As2);
        }
        else
        {
            flag = false;
        }

        return flag;
    }

    public String generateoutput(boolean isanagram) {
        String output;
        if(isanagram)
        {
            output = ("\"" + this.s1 + "\" and \"" + this.s2 + "\" are anagrams.");
        }
        else
        {
            output = ("\"" + this.s1 + "\" and \"" + this.s2 + "\" are not anagrams.");
        }
        return output;
    }
}
