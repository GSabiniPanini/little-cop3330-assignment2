package oop.assignment2.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {

    @Test
    void getrandomnumber_gives_a_valid_number()
    {
        MagicBall test = new MagicBall();

        int num = test.getrandomnumber();

        assertTrue(num >= 0 && num < 4);
    }
}