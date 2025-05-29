package com.example.Training.model;

public class ULPModel {
    public ULPModel(){

    }
    public String ulp_func(String input, int type) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("This field is required");
        }

        switch (type) {
            case 0: // UPPER
                return input.toUpperCase();
            case 1: // LOWER
                return input.toLowerCase();
            case 2: // PROPER
                return toProperCase(input);
            default:
                throw new IllegalArgumentException("Invalid conversion type. Use 0, 1, or 2.");
        }
    }

    private String toProperCase(String input) {
        String[] words = input.split("\\s+");
        StringBuilder r = new StringBuilder();

        for (String w : words) {
            if (!w.isEmpty()) {
                r.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1).toLowerCase());
            }
            r.append(" ");
        }

        return r.toString().trim();
    }
}
