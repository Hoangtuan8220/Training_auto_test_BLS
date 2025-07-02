package com.example.Training.tests;

import com.example.Training.model.MINIMUM;
import junit.framework.TestCase;

public class Hai_MINIMUM extends TestCase {
    public void testPositiveNumbers() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {5, 8, 2, 9, 12};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = 2;
        assertEquals(caseExpected, checkFunc);
    }

    public void testNegativeNumber() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {-6, -12, -5, -10, -25};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = -5;
        assertEquals(caseExpected, checkFunc);
    }
    public void testMixedNumber() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {1, 3, -5, -10, 25};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = -5;
        assertEquals(caseExpected, checkFunc);
    }

    public void testSingleElement() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {1};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = 1;
        assertEquals(caseExpected, checkFunc);
    }

    public void testDuplicateValues() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {3, 3, 3, 3, 3, 3};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = 3;
        assertEquals(caseExpected, checkFunc);
    }

    public void testEmptyArray() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = Integer.parseInt("There must be at least one value.");
        assertEquals(caseExpected, checkFunc);
    }

    public void testNullArray() {
        MINIMUM m = new MINIMUM();
        int[] inputData = {};
        int checkFunc = m.minimum_func(inputData);
        int caseExpected = Integer.parseInt("There must be at least one value.");
        assertEquals(caseExpected, checkFunc);
    }
}