package com.example.Training.model;

public class MINIMUM {

    public MINIMUM()
    {

    }

    public static int minimum_func(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("There must be at least one value.");
        }

        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

}

