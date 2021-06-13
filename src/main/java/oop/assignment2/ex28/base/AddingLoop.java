package oop.assignment2.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class AddingLoop
{
    private static final Scanner in = new Scanner(System.in);

    public int[] input = {0,0,0,0,0};
    public int sum = 0;

    public void readinput()
    {
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter a number: ");
            this.input[i] = in.nextInt();
        }
    }

    public int compute()
    {
        for(int i=0; i<5; i++)
        {
            this.sum += this.input[i];
        }

        return this.sum;
    }

}
