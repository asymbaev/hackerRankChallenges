package org.example.hackerRankProblems;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String [] tokens = s.split("[ !,?._'@]+");

        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        scanner.close();
    }
}
