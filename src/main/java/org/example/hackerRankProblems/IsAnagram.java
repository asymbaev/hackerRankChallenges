package org.example.hackerRankProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        if (Arrays.equals(charArrayA, charArrayB)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");

        }
    }
}
