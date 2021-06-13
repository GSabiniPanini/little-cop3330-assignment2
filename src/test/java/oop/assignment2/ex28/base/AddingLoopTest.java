package oop.assignment2.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingLoopTest {

    @Test
    void compute_gets_correct_sum_set1()
    {
        AddingLoop test = new AddingLoop();
        test.input[0] = 1;
        test.input[1] = 2;
        test.input[2] = 3;
        test.input[3] = 4;
        test.input[4] = 5;

        int expected = 15;
        int actual = test.compute();

        assertEquals(expected, actual);
    }

    @Test
    void compute_gets_correct_sum_set2()
    {
        AddingLoop test = new AddingLoop();
        test.input[0] = 5;
        test.input[1] = 2;
        test.input[2] = 6;
        test.input[3] = 1;
        test.input[4] = 4;

        int expected = 18;
        int actual = test.compute();

        assertEquals(expected, actual);
    }
}