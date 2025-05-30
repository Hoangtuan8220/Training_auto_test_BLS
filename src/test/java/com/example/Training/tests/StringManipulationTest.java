package com.example.Training.tests;

import junit.framework.TestCase;
import com.example.Training.model.*;

public class StringManipulationTest extends TestCase {

    public void testRemoveSpaces() {
        String input = "Hello, world!";
        String expected = "Hello,world!";
        String actual = StringManipulation.removeSpaces(input);
        assertEquals(expected, actual);
    }

    public void testRemoveSpacesWithMultipleSpaces() {
        String input = "   This   is   a   test   ";
        String expected = "Thisisatest";
        String actual = StringManipulation.removeSpaces(input);
        assertEquals(expected, actual);
    }

    public void testRemoveSpacesWithEmptyString() {
        String input = "";
        String expected = "";
        String actual = StringManipulation.removeSpaces(input);
        assertEquals(expected, actual);
    }

    public void testRemoveSpacesWithMixedCharacters() {
        String input = "123 45abc d e f 6";
        String expected = "12345abcdef6";
        String actual = StringManipulation.removeSpaces(input);
        assertEquals(expected, actual);
    }
}
