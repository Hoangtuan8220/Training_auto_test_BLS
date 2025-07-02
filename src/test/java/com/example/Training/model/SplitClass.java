package com.example.Training.model;

public class SplitClass {
    public SplitClass(){

    }

    public String split_Func(String input, String delimiter, int segment, String modifiers) {
        String[] parts = input.split(delimiter);

        if (segment < 0 || segment >= parts.length) {
            return "Segment invalid!";
        }

        return parts[segment];
    }


}
