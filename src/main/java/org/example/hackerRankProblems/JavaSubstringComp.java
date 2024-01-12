package org.example.hackerRankProblems;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class JavaSubstringComp {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            if (i == 0) {
                smallest = substring;
                largest = substring;
            } else {
                if (substring.compareTo(smallest) < 0) {
                    smallest = substring;
                }
                if (substring.compareTo(largest) > 0) {
                    largest = substring;
                }
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
