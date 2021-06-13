package oop.assignment2.ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void rowoutput_gets_right_string_set1()
    {
        MultiplicationTable test = new MultiplicationTable();

        int row = 11, column = 11;

        int expected = 144;

        int actual = test.rowoutput(row, column);

        assertEquals(expected, actual);
    }

    @Test
    void rowoutput_gets_right_string_set2()
    {
        MultiplicationTable test = new MultiplicationTable();

        int expected = 48;

        int actual = test.rowoutput(7, 5);

        assertEquals(expected, actual);
    }

    @Test
    void rowoutput_gets_right_string_set3()
    {
        MultiplicationTable test = new MultiplicationTable();

        int expected = 24;

        int actual = test.rowoutput(11, 1);

        assertEquals(expected, actual);
    }
}