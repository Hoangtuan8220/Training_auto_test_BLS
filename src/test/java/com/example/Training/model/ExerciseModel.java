package com.example.Training.model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.LinkedHashSet;

public class ExerciseModel {

    public String checkEvenOdd(int input) {
        if (input < 100 && input % 3 == 0) {
            return input % 2 == 0 ? "Even, multiple of 3, < 100" : "Odd, multiple of 3, < 100";
        } else {
            return "Not satisfied";
        }
    }

    public String formatDateTime(String input, int type) {
        try {
            SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = originalFormat.parse(input);

            SimpleDateFormat targetFormat;

            switch (type) {
                case 0:
                    targetFormat = new SimpleDateFormat("dd/MM/yyyy");
                    break;
                case 1:
                    targetFormat = new SimpleDateFormat("MM/dd");
                    break;
                case 2:
                    targetFormat = new SimpleDateFormat("HH:mm");
                    break;
                case 3:
                    targetFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    break;
                default:
                    targetFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    break;
            }
            return targetFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid input date format";
        }
    }

    public String removeDuplicateCharacter(String input) {
        LinkedHashSet<Character> s = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            s.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        return sb.toString();
    }
}
