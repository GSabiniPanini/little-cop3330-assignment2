package oop.assignment2.ex35.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerTest {

    @Test
    void getrandomnumber_give_random_number_within_range_set1()
    {
        Winner test = new Winner();
        test.length = 10;

        int actual = test.getrandomnumber();

        assertTrue(actual >=0 && actual < 10);
    }

    @Test
    void getrandomnumber_give_random_number_within_range_set2()
    {
        Winner test = new Winner();
        test.length = 100;

        int actual = test.getrandomnumber();

        assertTrue(actual >=0 && actual < 100);
    }
}