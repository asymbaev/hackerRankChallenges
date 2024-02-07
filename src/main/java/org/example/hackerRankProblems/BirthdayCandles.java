package org.example.hackerRankProblems;

import java.util.Collections;
import java.util.List;

public class BirthdayCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxHeight = Collections.max(candles);

        int count = 0;

        for (int candle: candles) {
            if (candle == maxHeight) {
                count++;
            }
        }
        return count;

    }
}
