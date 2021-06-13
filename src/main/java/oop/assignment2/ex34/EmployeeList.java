package oop.assignment2.ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class EmployeeList
{
    private static final Scanner in = new Scanner(System.in);
    public String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Zach Gryn", "David Morales"};
    public String[] newemployees = new String[4];

    public void printlist()
    {
        System.out.println("There are 5 employees:");
        for(int i=0; i<5; i++)
        {
            System.out.println(this.employees[i]);
        }
    }

    public String removeemployee()
    {
        System.out.println();
        System.out.print("Enter an employee name to remove: ");

        String remove = in.nextLine();
        return remove;
    }

    public String[] newlist(String remove)
    {
        for(int i=0, j=0; i<5; i++)
        {
            if(this.employees[i].equals(remove))
                continue;

            this.newemployees[j++] = this.employees[i];
        }

        return newemployees;
    }

    public void printnewlist()
    {
        System.out.println();
        System.out.println("There are 4 employees:");
        for(int i=0; i<4; i++)
        {
            System.out.println(this.newemployees[i]);
        }
    }


}
