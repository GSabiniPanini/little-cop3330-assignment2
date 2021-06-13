package oop.assignment2.ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class EmployeeInfo
{
    Scanner in = new Scanner(System.in);

    public String fname, lname, id, zip;

    public void readdata()
    {
        System.out.print("Enter the first name: ");
        this.fname = in.nextLine();
        System.out.print("Enter the last name: ");
        this.lname = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        this.zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        this.id = in.nextLine();
    }

    public boolean validatefnamelen(String fname)
    {
        int n = fname.length();
        boolean flag = n >= 2;

        return flag;
    }

    public boolean validatefnamefilled(String fname)
    {
        int n = fname.length();

        return !fname.isBlank();
    }

    public boolean validatelnamelen(String lname)
    {
        int n = lname.length();
        boolean flag = n >= 2;

        return flag;
    }

    public boolean validatelnamefilled(String lname)
    {
        int n = lname.length();

        return !lname.isBlank();
    }

    public boolean validatezip(String zip)
    {
        char[] zipA = zip.toCharArray();
        int n = zip.length(), flag = 0;
        boolean bflag = false;

        for(int i=0; i<n; i++)
        {
            if(Character.isDigit(zipA[i]))
                flag++;
        }

        if(flag == n && n == 5)
            bflag = true;

        return bflag;
    }

    public boolean validateid(String id)
    {
        int n = id.length(), flag = 0;
        boolean bflag = false;

        char[] idA = id.toCharArray();
        if(n == 7)
        {
            if(Character.isLetter(idA[0]) && Character.isLetter(idA[1]))
                flag += 2;

            char arr2 = idA[2];
            if(Character.compare(arr2, '-') == 0)
                flag ++;

            if(Character.isDigit(idA[3]) && Character.isDigit(idA[4]) && Character.isDigit(idA[5]) && Character.isDigit(idA[6]))
                flag += 4;
        }
        if(flag == 7)
            bflag = true;

        return bflag;
    }

    public int validateInput(String fname, String lname, String zip, String id)
    {
        int counter = 0;

        if(!this.validatefnamelen(fname))
        {
            counter ++;
            System.out.println("The first name must be at least 2 characters long.");
        }

        if(!this.validatelnamelen(lname))
        {
            counter ++;
            System.out.println("The last name must be at least 2 characters long.");
        }

        if(!this.validatefnamefilled(fname))
        {
            counter ++;
            System.out.println("The first name must be filled in.");
        }

        if(!this.validatelnamefilled(lname))
        {
            counter ++;
            System.out.println("The last name must be filled in.");
        }

        if(!this.validateid(id))
        {
            counter ++;
            System.out.println("The employee ID must be in the format of AA-1234.");
        }

        if(!this.validatezip(zip))
        {
            counter ++;
            System.out.println("The zipcode must be a 5 digit number.");
        }

        return counter;
    }

    public boolean isoutput(int counter)
    {
        boolean flag = false;
        if(counter == 0)
            flag = true;
        return flag;
    }

    public String getoutput(int counter)
    {
        String output;
        if(counter == 0)
            output = ("There were no errors found.");
        else
            output = ("There was an error");

        return output;
    }
}
