package com.example.Training.tests;

import com.example.Training.model.ULPModel;
import junit.framework.TestCase;

public class ULPTest extends TestCase {
    public void caseUpper(){
        ULPModel u = new ULPModel();
        String text = "fake test";
        int type = 0;
        String checkFunc = u.ulp_func(text,type);
        String expected = "FAKE TEST";
        assertEquals(expected,checkFunc);
    }

    public void caseLower(){
        ULPModel u = new ULPModel();
        String text = "faKE tESt";
        int type = 1;
        String checkFunc = u.ulp_func(text,type);
        String expected = "fake test";
        assertEquals(expected,checkFunc);
    }

    public void caseProper(){
        ULPModel u = new ULPModel();
        String text = "fAKe TEST";
        int type = 2;
        String checkFunc = u.ulp_func(text,type);
        String expected = "Fake Test";
        assertEquals(expected,checkFunc);
    }
}
