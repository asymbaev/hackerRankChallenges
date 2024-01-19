package org.example.hackerRankProblems;

import java.util.Scanner;

public class MinElChallenge {


    public int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comma-separated integers: ");
        String input = scanner.nextLine();
        String[] stringNumbers = input.split(",");
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        return numbers;


    }
}
