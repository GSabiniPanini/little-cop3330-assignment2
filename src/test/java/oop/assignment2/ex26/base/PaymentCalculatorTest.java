package oop.assignment2.ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_gives_correct_value_set1()
    {
        PaymentCalculator test = new PaymentCalculator();
        int expected = 70;

        test.bal = 5000;
        test.APR = .12;
        test.mp = 100;

        int actual = test.calculateMonthsUntilPaidOff();

        assertEquals(expected, actual);
    }

}