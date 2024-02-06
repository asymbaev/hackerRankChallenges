package org.example.hackerRankProblems;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int len = arr.size();

        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;

        for (int i = 0; i < len; i++) {
            if (arr.get(i) > 0) {
                positiveCount++;
            } else if (arr.get(i) < 0) {
                negativeCount++;
                
            } else if (arr.get(i) == 0) {
                zeroCount++;

            }
        }

        System.out.printf("%.6f\n", positiveCount / len);
        System.out.printf("%.6f\n", negativeCount / len);
        System.out.printf("%.6f\n", zeroCount / len);
    }
}
