package org.example.hackerRankProblems;

import java.util.List;

public class SubArrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;

        // Edge case: If m is greater than the length of the array, return 0.
        if (m > s.size()) {
            return 0;
        }

        // Initialize the sum for the first window of size m.
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
    }
}
