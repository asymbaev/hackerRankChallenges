package org.example.hackerRankProblems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Create a HashMap to store bird type frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array to count bird occurences
        for (int birdType : arr) {
            frequencyMap.put(birdType, frequencyMap.getOrDefault(birdType, 0) + 1);

        }

        int maxFrequency = 0;
        int mostCommonBird = Integer.MAX_VALUE; // Initialize to the maximum possible value

        //Iterate through the frequency map to find the most common birdType
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int birdType = entry.getKey();
            int frequency = entry.getValue();

            // if we find a bird type with higher frequency or same frequency but smaller ID
            if (frequency > maxFrequency || (frequency == maxFrequency && birdType < mostCommonBird)) {
                maxFrequency = frequency;
                mostCommonBird = birdType;
            }

        }
        return mostCommonBird;
    }
}
