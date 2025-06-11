package com.example.Training.tests;

import com.example.Training.model.SortClass;
import junit.framework.TestCase;
import org.junit.Assert;

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

    public void testSortMatrix() {
        SortClass s = new SortClass();
        int[][] input = {
                {9, 4, 3},
                {9, 2, 2},
                {7, 6, 5}
        };

        int[][] res = s.sort_func(input);
        assertSortedByColumn(res);
        //assertTrue(aaa);
    }

    public void testSortMatrixDuplicates() {
        SortClass s = new SortClass();
        int[][] input = {{2, 2}, {1, 1}, {2, 2}};
        int[][] res = s.sort_func(input); 
        assertSortedByColumn(res);
    }

    public void testSortMatrixComplex() {
        SortClass s = new SortClass();
        int[][] input = {{3, 2, 1}, {1, 2, 3}, {2, 2, 2}, {1, 2, 2}, {2,4,5}, {3,5,9}, {0,8,3}};
        int[][] res = s.sort_func(input); 
        assertSortedByColumn(res);
    }

    public void testSortMatrixRandom() {
        SortClass s = new SortClass();
        int[][] input = {{3, 2, 1, 9}, {1, 2, 3}, {2, 2, 2,0}, {1, 2, 2,4,3}, {2,4,5}, {3,5,9,7}, {0,8,3}};
        int[][] res = s.sort_func(input);
        assertSortedByColumn(res);
    }

    public void testSortMatrixEmpty() {
        SortClass s = new SortClass();
        int[][] input = {};
        int[][] res = s.sort_func(input); 
        assertSortedByColumn(res);
    }

    public void testSortMatrixSingleElementRows() {
        SortClass s = new SortClass();
        int[][] input = {{3}, {1}, {2}};
        int[][] res = s.sort_func(input); 
        assertSortedByColumn(res);
    }

    private void assertSortedByColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1 ; i++) {
            int[] current = matrix[i];
            int[] next = matrix[i + 1];

            for (int j = 0; j < current.length ; j++) {
                if (current[j] < next[j]) {
                    break;
                } else if (current[j] > next[j]) {
                    fail("Matrix rows are not sorted correctly at row " + i + "in column" + j);
                }
            }
        }
    }
}
