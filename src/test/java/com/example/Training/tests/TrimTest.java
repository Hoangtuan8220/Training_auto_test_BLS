package com.example.Training.tests;

import com.example.Training.model.TrimClass;
import junit.framework.TestCase;

public class TrimTest extends TestCase {
    public void testMethod0() {
        TrimClass tr = new TrimClass();
        String inputData= "   Hello Phuong        ";
        String checkFunc = tr.trimTest(inputData,0);
        String caseExpected = "Hello Phuong";
        assertEquals(caseExpected, checkFunc);
    }
    public void testMethod1() {
        TrimClass tr = new TrimClass();
        String inputData= "   Hello Phuong";
        String checkFunc = tr.trimTest(inputData,1);
        String caseExpected = "Hello Phuong";
        assertEquals(caseExpected, checkFunc);
    }
    public void testMethod2() {
        TrimClass tr = new TrimClass();
        String inputData= "Hello Phuong  ";
        String checkFunc = tr.trimTest(inputData,2);
        String caseExpected = "Hello Phuong";
        assertEquals(caseExpected, checkFunc);
    }
    public void testMethod3() {
        TrimClass tr = new TrimClass();
        String inputData= "Hello          Phuong";
        String checkFunc = tr.trimTest(inputData,3);
        String caseExpected = "Hello Phuong";
        assertEquals(caseExpected, checkFunc);
    }
    public void testMethod4() {
        TrimClass tr = new TrimClass();
        String inputData= "Hel lo Phuo ng";
        String checkFunc = tr.trimTest(inputData,4);
        String caseExpected = "HelloPhuong";
        assertEquals(caseExpected, checkFunc);
    }
    public void testEmpty() {
        TrimClass tr = new TrimClass();
        String inputData= "";
        String checkFunc = tr.trimTest(inputData,0);
        String caseExpected = "";
        assertEquals(caseExpected, checkFunc);
    }
    public void testSpace() {
        TrimClass tr = new TrimClass();
        String inputData= "a";
        String checkFunc = tr.trimTest(inputData,3);
        String caseExpected = "a";
        assertEquals(caseExpected, checkFunc);
    }
    public void testTrailingSpace() { //Trim end when beginning has space
        TrimClass tr = new TrimClass();
        String inputData= "    a";
        String checkFunc = tr.trimTest(inputData,2);
        String caseExpected = "    a";
        assertEquals(caseExpected, checkFunc);
    }

}
