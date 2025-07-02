package com.example.Training.model;

import java.util.Arrays;
public class SortClass {
    public SortClass()
    {

    }
    public int[] sort_func(int[] arr) {
        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);

        return sortedArr;
    }

    public int[][] sort_func(int[][] arr) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        Arrays.sort(newArr, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                int cmp = Integer.compare(a[i], b[i]);
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });
        return newArr;
    }
}
