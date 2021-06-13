package oop.assignment2.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class InputLoop
{
    private static final Scanner in = new Scanner(System.in);
    public float input = 1, years = 0;

    public void badinputloop()
    {
        do {
            if (this.input == 0)
                System.out.println("Sorry. That's not a valid input.");

            System.out.print("What is the rate of return? ");
            if (!in.hasNextInt()) {
                System.out.println("Sorry. That's not a valid input.");
                in.next();
            }

            this.input = in.nextInt();
        } while (this.input == 0);
    }



    public int compute()
    {
        this.years = 72 / this.input;
        return (int) this.years;
    }

    public String getoutput()
    {
        String output = ("It will take " + (int) this.years + " years to double your initial investment.");
        return output;
    }

}
