package com.example.Training.tests;

import com.example.Training.model.SplitClass;
import junit.framework.TestCase;

public class SplitTest extends TestCase {
    public void testValidSegment() {
        String input = "aaaa,bb/ccc,cdfe/sssss";
        String delimiter = "/";
        int segment = 1;
        String modifiers = ",";

        SplitClass str = new SplitClass();
        String res = str.split_Func(input, delimiter, segment,modifiers);

        String expected = "ccc,cdfe";

        assertEquals(expected, res);
    }
    public void testSegmentZero() {
        String input = "aaaa,bb/ccc,cdfe/sssss";
        String delimiter = "/";
        int segment = 0;
        String modifiers = ",";

        SplitClass str = new SplitClass();
        String res = str.split_Func(input, delimiter, segment,modifiers);

        String expected = "aaaa,bb";

        assertEquals(expected, res);
    }
    public void testInvalidSegmentNegative() {
        String input = "aaaa,bb/ccc,cdfe/sssss";
        String delimiter = "/";
        int segment = -1;
        String modifiers = ",";

        SplitClass str = new SplitClass();
        String res = str.split_Func(input, delimiter, segment,modifiers);

        String expected = "Segment invalid!";

        assertEquals(expected, res);
    }
    public void testStringInputIsOneCharacter() {
        String input = "a";
        String delimiter = "a";
        int segment = 0;
        String modifiers = "";

        SplitClass str = new SplitClass();
        String res = str.split_Func(input, delimiter, segment,modifiers);

        String expected = "Segment invalid!";

        assertEquals(expected, res);
    }
    public void testStringInputIsDatetime() {
        String input = "2025/06/20 03:05:44";
        String delimiter = "/";
        int segment = 2;
        String modifiers = ":";

        SplitClass str = new SplitClass();
        String res = str.split_Func(input, delimiter, segment,modifiers);

        String expected = "20 03:05:44";

        assertEquals(expected, res);
    }
    public void testDelimeterIsSpace() {
        String input = "2025/06/20 03:05:44";
        String delimiter = " ";
        int segment = 1;
        String modifiers = ":";

        SplitClass str = new SplitClass();
        String res = str.split_Func(input, delimiter, segment,modifiers);

        String expected = "03:05:44";

        assertEquals(expected, res);
    }
}
