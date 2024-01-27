package org.example.hackerRankProblems;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AveryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long i : ar) {
            sum += i;
        }
        return sum;
    }
}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Long::parseLong)
//                .collect(toList());
//
//        long result = AveryBigSum.aVeryBigSum(ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

