package com.example.Training.tests;

import com.example.Training.model.SortClass;
import junit.framework.TestCase;

public class SortTest extends TestCase {
    public void testSortAscendingNormal() {
        SortClass s = new SortClass();
        int[] a = {10, 7, 3, 10, 7};

        int[] res = s.sort_func(a);

        for (int i = 1; i < res.length; i++)
        {
            if (i < res.length - 1)
            {
                if (res[i] > res[i + 1])
                {
                    fail();
                }
            }
        }
        assertTrue(true);
    }
}
