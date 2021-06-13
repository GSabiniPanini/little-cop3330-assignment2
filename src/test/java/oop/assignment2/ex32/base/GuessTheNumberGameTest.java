package oop.assignment2.ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {

    @Test
    void getrandomnumber_gets_random_number_set1()
    {
        GuessTheNumberGame test = new GuessTheNumberGame();

        int difficulty = 1;

        int number = test.getrandomnumber(difficulty);

        assertTrue(number >= 0 && number <= 10);

    }

    @Test
    void getrandomnumber_gets_random_number_set2()
    {
        GuessTheNumberGame test = new GuessTheNumberGame();

        int difficulty = 2;

        int number = test.getrandomnumber(difficulty);

        assertTrue(number >= 0 && number <= 100);

    }

    @Test
    void getrandomnumber_gets_random_number_set3()
    {
        GuessTheNumberGame test = new GuessTheNumberGame();

        int difficulty = 3;

        int number = test.getrandomnumber(difficulty);

        assertTrue(number >= 0 && number <= 1000);

    }
}