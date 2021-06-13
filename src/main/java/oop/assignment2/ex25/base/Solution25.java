package oop.assignment2.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class Solution25
{
    public static void main(String[] args)
    {
        PasswordReader pr = new PasswordReader();

        String pw = pr.readpassword();
        int key = pr.passwordValidator(pw);

        String output = pr.readkey(key, pw);
        System.out.println(output);
    }
}
