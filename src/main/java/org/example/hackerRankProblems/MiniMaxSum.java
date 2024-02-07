package org.example.hackerRankProblems;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        // Calculate minimum sum
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }
        for (int i = arr.size() - 1; i >= arr.size() - 4; i--) {
            maxSum += arr.get(i);
        }
        System.out.println(minSum + " " + maxSum);
    }
}
