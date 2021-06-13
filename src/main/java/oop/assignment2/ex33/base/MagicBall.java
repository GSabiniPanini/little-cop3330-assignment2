package oop.assignment2.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Random;
import java.util.Scanner;

public class MagicBall
{
    private String[] outputs = {"Yes", "No", "Maybe", "Ask again later."};
    private Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);

    int number = rand.nextInt((3-1) + 1) + 1;

    public void askquestion()
    {
        System.out.println("What's your question?");
        System.out.print("> ");
        in.nextLine();
        System.out.println();
    }

    public int getrandomnumber()
    {
        int number = rand.nextInt((3-1) + 1) + 1;
        return number;
    }

    public String generateoutput(int number)
    {
        String output = this.outputs[number];
        return output;
    }

}
