package oop.assignment2.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @Test
    void calculation_gets_right_formula_set1()
    {
        HeartRate test = new HeartRate();

        test.pulse = 65;
        test.age = 22;

        int expected = 138;
        int actual = test.calculation(test.pulse, test.age, .55);

        assertEquals(expected, actual);
    }

    @Test
    void calculation_gets_right_formula_set2()
    {
        HeartRate test = new HeartRate();

        test.pulse = 65;
        test.age = 22;

        int expected = 191;
        int actual = test.calculation(test.pulse, test.age, .95);

        assertEquals(expected, actual);
    }

    @Test
    void calculation_gets_right_formula_set3()
    {
        HeartRate test = new HeartRate();

        test.pulse = 65;
        test.age = 22;

        int expected = 164;
        int actual = test.calculation(test.pulse, test.age, .75);

        assertEquals(expected, actual);
    }
}