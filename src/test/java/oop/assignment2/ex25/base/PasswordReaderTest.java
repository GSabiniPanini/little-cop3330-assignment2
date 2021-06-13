package oop.assignment2.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordReaderTest {

    @Test
    void passwordValidator_returns_zero_for_very_weak()
    {
        PasswordReader test = new PasswordReader();
        int expected = 0;

        int actual = test.passwordValidator("12345");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_returns_zero_for_weak()
    {
        PasswordReader test = new PasswordReader();
        int expected = 1;

        int actual = test.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_returns_zero_for_strong()
    {
        PasswordReader test = new PasswordReader();
        int expected = 2;

        int actual = test.passwordValidator("abc123xyz");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_returns_zero_for_very_strong()
    {
        PasswordReader test = new PasswordReader();
        int expected = 3;

        int actual = test.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }
}