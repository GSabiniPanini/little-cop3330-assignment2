package oop.assignment2.ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Winner
{
    private static final Scanner in = new Scanner(System.in);
    public ArrayList<String> contestants = new ArrayList<String>();
    public int length = 0;

    public void readnames()
    {
        System.out.print("Enter a name: ");
        String put = in.nextLine();

        for(int i=0; !put.isBlank(); i++)
        {
            this.length ++;
            contestants.add(put);
            System.out.print("Enter a name: ");
            put = in.nextLine();
        }
    }

    public int getrandomnumber()
    {
        Random rand = new Random();
        int number = rand.nextInt(this.length);
        return number;
    }

    public String getwinner(int number)
    {
        String winner = ("The Winner is... " + this.contestants.get(number) + ".");
        return winner;
    }
}
