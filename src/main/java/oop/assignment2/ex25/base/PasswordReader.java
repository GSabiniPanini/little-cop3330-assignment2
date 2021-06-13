package oop.assignment2.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class PasswordReader
{
    private static final Scanner in = new Scanner(System.in);

    private boolean hasnumbers;
    private boolean haschars;
    private boolean hasletters;
    private boolean hasspecials;

    public String readpassword()
    {
        System.out.print("Enter a password: ");

        return in.nextLine();
    }
    public int passwordValidator(String pw)
    {
        processpassword(pw);
        int key = -1;

        if(this.hasnumbers && !this.haschars && !this.hasspecials && !this.hasletters)
        {
            key = 0;
        }
        else if(!this.hasnumbers && !this.haschars && !this.hasspecials && this.hasletters)
        {
            key = 1;
        }
        else if(this.hasnumbers && this.haschars && !this.hasspecials && this.hasletters)
        {
            key = 2;
        }
        else if(this.hasnumbers && this.haschars && this.hasspecials && this.hasletters)
        {
            key = 3;
        }

        return key;
    }

    public void processpassword(String pw)
    {
        int n = pw.length(), x = 0, y = 0;

        this.haschars = n >= 8;

        this.hasspecials = pw.contains("~") || pw.contains("!") || pw.contains("@") || pw.contains("#") || pw.contains("$") || pw.contains("%") || pw.contains("^") || pw.contains("&") || pw.contains("*") || pw.contains("(") || pw.contains(")") || pw.contains("-") || pw.contains("+");

        char[] password = pw.toCharArray();
        for(int i=0; i < n; i++) {
            if(Character.isDigit(password[i]))
                x++;

            if(Character.isLetter(password[i]))
                y++;
        }

        this.hasnumbers = x > 0;
        this.hasletters = y > 0;
    }

    public String readkey(int key, String pw)
    {
        String output = "Error";
        switch(key)
        {
            case 0:
                output = ("The password '" + pw + "' is a very weak password.");
                break;
            case 1:
                output = ("The password '" + pw + "' is a weak password.");
                break;
            case 2:
                output = ("The password '" + pw + "' is a strong password.");
                break;
            case 3:
                output = ("The password '" + pw + "' is a very strong password.");
                break;
        }

        return output;
    }
}
