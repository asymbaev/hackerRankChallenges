package org.example.hackerRankProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> occurenceMap = new HashMap<>();

        for (String str : stringList) {
            if (occurenceMap.containsKey(str)) {
                occurenceMap.put(str, occurenceMap.get(str) + 1);
            } else {
                occurenceMap.put(str, 1);
            }
        }
        List<Integer> occurences = new ArrayList<>();

        for (String q : queries) {
            int count = occurenceMap.getOrDefault(q, 0);
            occurences.add(count);
        }
        return occurences;
    }
}
