package oop.assignment2.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {

    @Test
    void average()
    {
        ComputingStatistics test = new ComputingStatistics();
        test.nums.add(100);
        test.nums.add(200);
        test.nums.add(1000);
        test.nums.add(300);
        test.length = 4;
        double expected = 400.0;

        double actual = test.average(test.nums);
        assertEquals(expected, actual);
    }

    @Test
    void min()
    {
        ComputingStatistics test = new ComputingStatistics();
        test.nums.add(100);
        test.nums.add(200);
        test.nums.add(1000);
        test.nums.add(300);
        test.length = 4;
        double expected = 100;

        double actual = test.min(test.nums);
        assertEquals(expected, actual);
    }

    @Test
    void max()
    {
        ComputingStatistics test = new ComputingStatistics();
        test.nums.add(100);
        test.nums.add(200);
        test.nums.add(1000);
        test.nums.add(300);
        test.length = 4;
        double expected = 1000;

        double actual = test.max(test.nums);
        assertEquals(expected, actual);
    }

    @Test
    void std()
    {
        ComputingStatistics test = new ComputingStatistics();
        test.nums.add(100);
        test.nums.add(200);
        test.nums.add(1000);
        test.nums.add(300);
        test.length = 4;
        test.average = 400.0;
        double expected = 353.5533905932738;

        double actual = test.std(test.nums);
        assertEquals(expected, actual);
    }
}