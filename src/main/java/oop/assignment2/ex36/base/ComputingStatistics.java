package oop.assignment2.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStatistics
{
    private static final Scanner in = new Scanner(System.in);
    public ArrayList<Integer> nums = new ArrayList<Integer>();
    public int length = 0, sum = 0;
    public double average = 0.0, stdev = 0.0, square = 0.0, minimum, maximum;


    public void readinput()
    {
        System.out.print("Enter a number: ");
        do
        {
            String input = in.nextLine();
            if(input.equals("done"))
                break;

            if(Integer.parseInt(input) > 0)
            {
                nums.add(Integer.parseInt(input));
                length ++;
                System.out.print("Enter a number: ");
            }
        } while(1 == 1);
    }

    public void recap()
    {
        System.out.print("Numbers: ");
        for(int i=0; i<length; i++)
        {
            if(i==length-1)
            {
                System.out.printf("%d", nums.get(i));
                continue;
            }
            System.out.printf("%d, ", nums.get(i));
        }
        System.out.println();

        average = average(nums);
        minimum = min(nums);
        maximum = max(nums);
        stdev = std(nums);
    }

    public double average(ArrayList<Integer> nums)
    {
        for(int i=0; i<length; i++)
        {
            sum += nums.get(i);
        }
        average = sum / length;

        System.out.println("The average is " + average);

        return average;
    }

    public double min(ArrayList<Integer> nums)
    {
        minimum = nums.get(0);
        for(int i=1; i<length; i++)
        {
            if(nums.get(i) < minimum)
                minimum = nums.get(i);
        }

        System.out.printf("The minimum is %.0f%n", minimum);

        return minimum;
    }

    public double max(ArrayList<Integer> nums)
    {
        maximum = nums.get(0);
        for(int i=1; i<length; i++)
        {
            if(nums.get(i) > maximum)
                maximum = nums.get(i);
        }

        System.out.printf("the maximum is %.0f%n", maximum);

        return maximum;
    }

    public double std(ArrayList<Integer> nums)
    {
        double result = 0;
        for(int i=0; i<length; i++)
        {
            result += Math.pow((nums.get(i) - average), 2);
        }
        square = result / length;
        stdev = Math.sqrt(square);

        System.out.printf("The standard deviation is %.2f%n", stdev);

        return stdev;
    }



}
