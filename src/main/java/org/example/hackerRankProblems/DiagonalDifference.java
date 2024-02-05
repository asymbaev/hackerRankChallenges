package org.example.hackerRankProblems;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int sumOfLeft = 0;
        int sumOfRight = 0;

        for (int i = 0; i < n; i++) {
            sumOfLeft += arr.get(i).get(n - 1 - i);
            sumOfRight += arr.get(i).get(i);
        }
        return Math.abs(sumOfLeft-sumOfRight);


    }
}
