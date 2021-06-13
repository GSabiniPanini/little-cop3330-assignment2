package oop.assignment2.ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeInfoTest {

    @Test
    void validatefnamelen_returns_correct_set1()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.fname = "John";

        boolean actual = test.validatefnamelen(test.fname);

        assertTrue(actual);
    }

    @Test
    void validatefnamelen_returns_correct_set2()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.fname = "J";

        boolean actual = test.validatefnamelen(test.fname);

        assertFalse(actual);
    }

    @Test
    void validatefnamefilled_returns_correct_set1()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.fname = "John";

        boolean actual = test.validatefnamefilled(test.fname);

        assertTrue(actual);
    }

    @Test
    void validatefnamefilled_returns_correct_set2()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.fname = "";

        boolean actual = test.validatefnamefilled(test.fname);

        assertFalse(actual);
    }

    @Test
    void validatefnamefilled_returns_correct_set3()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.fname = "  ";

        boolean actual = test.validatefnamefilled(test.fname);

        assertFalse(actual);
    }

    @Test
    void validatelnamelen_returns_correct_set1()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.lname = "Johnson";

        boolean actual = test.validatelnamelen(test.lname);

        assertTrue(actual);
    }

    @Test
    void validatelnamelen_returns_correct_set2()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.lname = "J";

        boolean actual = test.validatelnamelen(test.lname);

        assertFalse(actual);
    }

    @Test
    void validatelnamefilled_returns_correct_set1()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.lname = "Johnson";

        boolean actual = test.validatelnamefilled(test.lname);

        assertTrue(actual);
    }

    @Test
    void validatelnamefilled_returns_correct_set2()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.lname = "";

        boolean actual = test.validatelnamefilled(test.lname);

        assertFalse(actual);
    }

    @Test
    void validatelnamefilled_returns_correct_set3()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.lname = "  ";

        boolean actual = test.validatelnamefilled(test.lname);

        assertFalse(actual);
    }

    @Test
    void validatezip_returns_correct_set1()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.zip = "55555";

        boolean actual = test.validatezip(test.zip);

        assertTrue(actual);
    }

    @Test
    void validatezip_returns_correct_set2()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.zip = "5555a";

        boolean actual = test.validatezip(test.zip);

        assertFalse(actual);
    }

    @Test
    void validateid_returns_correct_set1()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.id = "TK-4321";

        boolean actual = test.validateid(test.id);

        assertTrue(actual);
    }

    @Test
    void validateid_returns_correct_set2()
    {
        EmployeeInfo test = new EmployeeInfo();
        test.id = "A12-4321";

        boolean actual = test.validateid(test.id);

        assertFalse(actual);
    }
}