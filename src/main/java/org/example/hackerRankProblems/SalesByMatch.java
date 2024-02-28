package org.example.hackerRankProblems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Create a HashMap to store the frequency of each sock color
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the list of socks
        for (int color: ar) {
            // Updating the frequency of the current sock color
            frequencyMap.put(color, frequencyMap.getOrDefault(color, 0) + 1);
        }

        int pairCount = 0;
        // Iterate through the frequency map to count pairs
        for (int frequency : frequencyMap.values()) {
            // Each pair can be formed by dividing the frequency by 2
            pairCount += frequency / 2;
        }
        return pairCount;
    }
}
