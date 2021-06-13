package oop.assignment2.ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isanagram_for_anagrams_true()
    {
        AnagramChecker test = new AnagramChecker();
        test.s1 = "note";
        test.s2 = "tone";

        boolean actual = test.isanagram();


        assertTrue(actual);
    }

    @Test
    void isanagram_for_nonanagrams_false()
    {
        AnagramChecker test = new AnagramChecker();
        test.s1 = "note";
        test.s2 = "not";
        boolean actual = test.isanagram();


        assertFalse(actual);
    }
}