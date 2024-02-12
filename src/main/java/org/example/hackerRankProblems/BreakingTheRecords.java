package org.example.hackerRankProblems;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {

        int lowestScore = scores.get(0);
        int highestScore = scores.get(0);

        int countLowest = 0;
        int countHighest = 0;

        List<Integer> recordCounts = new ArrayList<>();

        for(int i = 1; i < scores.size(); i++) {
            int currentScore = scores.get(i);

            if (currentScore < lowestScore) {
                lowestScore = currentScore;
                countLowest++;
            }
            if (currentScore > highestScore) {
                highestScore = currentScore;
                countHighest++;
            }
        }
        recordCounts.add(countHighest);
        recordCounts.add(countLowest);

        return recordCounts;
    }
}
