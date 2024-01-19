package org.example.hackerRankProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MinElChallenge {

    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println("Numbers entered: " + Arrays.toString(numbers));
        int min = findMin(numbers);
        System.out.println("Minimum values: " + min);
    }


    public static int[] readIntegers() {
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
    public static int findMin(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
