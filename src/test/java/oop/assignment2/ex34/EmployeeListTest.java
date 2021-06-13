package oop.assignment2.ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeListTest {

    @Test
    void newlist_creates_the_correct_list_set1()
    {
        EmployeeList test = new EmployeeList();

        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "David Morales"};

        String[] actual = test.newlist("Zach Gryn");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void newlist_creates_the_correct_list_set2()
    {
        EmployeeList test = new EmployeeList();

        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Zach Gryn"};

        String[] actual = test.newlist("David Morales");

        Assertions.assertArrayEquals(expected, actual);
    }
}