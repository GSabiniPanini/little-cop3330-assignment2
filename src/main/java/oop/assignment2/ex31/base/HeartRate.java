package oop.assignment2.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;

public class HeartRate
{
    private static final Scanner in = new Scanner(System.in);
    public int pulse, age;

    public void readinput()
    {
        System.out.print("Resting Pulse: ");
        this.pulse = intinputloop();

        System.out.print("Age: ");
        this.age = intinputloop();
    }

    public int intinputloop()
    {
        int input;

        while (!in.hasNextInt())
            in.next();

        input = in.nextInt();

        return input;
    }

    public void printoutput()
    {
        System.out.printf("Resting Pulse: %d\t\tAge: %d%n%n", this.pulse, this.age);
        System.out.printf("%s%4s%5s%n", "Intensity", "|", "Rate");
        System.out.printf("------------|--------\n");

        double frac = .55;
        for(int i=0; i<=8; i++)
        {
            System.out.printf("%.0f%%%10s%4d bpm%n", frac*100, "|", calculation(this.pulse, this.age, frac));

            frac += .05;
        }
    }

    public int calculation(int pulse, int age, double intensity)
    {
        double targetrate = (((220 - age) - pulse) * intensity) + pulse;
        int result = (int) targetrate;
        return result;
    }
}
