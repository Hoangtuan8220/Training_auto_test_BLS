package com.example.Training.model;

import java.util.ArrayList;
import java.util.List;

public class FilterModel {
    public List<int[]> filterByColumnValue(int[][] table, int columnIndex, int value) {
        List<int[]> filtered = new ArrayList<>();
        for (int[] row : table) {
            if (row[columnIndex] == value) {
                filtered.add(row);
            }
        }
        return filtered;
    }

    public List<int[]> filterByCondition(int[][] table, int columnIndex, int threshold, String operator) {
        List<int[]> filtered = new ArrayList<>();
        for (int[] row : table) {
            int val = row[columnIndex];
            boolean match = false;
            switch (operator) {
                case ">":
                    match = val > threshold;
                    break;
                case "<":
                    match = val < threshold;
                    break;
                case ">=":
                    match = val >= threshold;
                    break;
                case "<=":
                    match = val <= threshold;
                    break;
                case "!=":
                    match = val != threshold;
                    break;
                case "==":
                    match = val == threshold;
                    break;
                default:
                    match = false;
            }
            if (match) {
                filtered.add(row);
            }
        }
        return filtered;
    }

}
