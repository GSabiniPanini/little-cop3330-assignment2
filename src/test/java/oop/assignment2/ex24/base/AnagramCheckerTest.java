package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isanagram_note_tone_true()
    {
        boolean expected = true;

        AnagramChecker test = new AnagramChecker();
        test.s1 = "note";
        test.s2 = "tone";

        boolean actual = test.isanagram();


        assertEquals(expected, actual);
    }

    @Test
    void isanagram_note_not_false()
    {
        boolean expected = false;

        AnagramChecker test = new AnagramChecker();
        test.s1 = "note";
        test.s2 = "not";
        boolean actual = test.isanagram();


        assertEquals(expected, actual);
    }
}