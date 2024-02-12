package org.example.hackerRankProblems;

import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int maxA = Collections.max(a);
        int minB = Collections.min(b);

        for(int i = maxA; i<=minB; i++) {
            boolean isFactorOfB = true;
            for(int num : b) {
                if(num % i != 0) {
                    isFactorOfB = false;
                    break;
                }
            }
            if(isFactorOfB) {
                boolean isFactorOfA = true;
                for(int num : a) {
                    if(i % num != 0) {
                        isFactorOfA = false;
                        break;
                    }
                }
                if (isFactorOfA) {
                    count++;
                }
            }

        }
        return count;
    }
}
