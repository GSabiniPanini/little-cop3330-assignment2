package oop.assignment2.ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame
{
    private final Scanner in = new Scanner(System.in);

    public int selectdifficulty()
    {
        int difficulty = 0;
        System.out.print("Enter the difficulty level (1, 2, or 3): ");

        while(!in.hasNextInt())
            in.next();

        difficulty = in.nextInt();
        return difficulty;
    }

    public void repeatloop()
    {
        String flag2 = "y";
        boolean flag = false;

        do {
            startgame();
            System.out.println();
            System.out.print("Do you wish to play again (Y/N)? ");
            flag2 = in.next();

            if(flag2.equals("n") || flag2.equals("N"))
                flag = true;
        } while(!flag);
    }

    public void startgame()
    {
        int number = 0;
        int counter = 0;
        boolean flag = false;

        int difficulty = selectdifficulty();

        number = getrandomnumber(difficulty);

        System.out.print("I have my number.. What's your guess? ");

        while(!flag)
        {
            while (!in.hasNextInt()) {
                counter++;
                System.out.print("Nope. Guess again: ");
                in.next();
            }

            int guess = in.nextInt();

            if (guess > number)
            {
                System.out.print("Too high. Guess again: ");
                counter++;
            }
            else if (guess < number)
            {
                System.out.print("Too low. Guess again: ");
                counter++;
            }
            else if (guess == number)
            {
                counter++;
                System.out.println("You got it in " + counter + " guesses!");
                flag = true;
            }
        }
    }

    public int getrandomnumber(int difficulty)
    {
        Random rand = new Random();
        int min = 1, number = 1;

        switch(difficulty) {
            case 1:
                number = rand.nextInt((10-min) + 1) + min;
                break;
            case 2:
                number = rand.nextInt((100-min) + 1) + min;
                break;
            case 3:
                number = rand.nextInt((1000-min) + 1) + min;
                break;
        }

        return number;
    }


}
