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

}
