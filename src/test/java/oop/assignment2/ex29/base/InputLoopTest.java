package oop.assignment2.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputLoopTest {

    @Test
    void compute_gets_correct_years()
    {
        InputLoop test = new InputLoop();

        test.input = 4;

        int expected = 18;
        int actual = test.compute();

        assertEquals(expected, actual);
    }
}