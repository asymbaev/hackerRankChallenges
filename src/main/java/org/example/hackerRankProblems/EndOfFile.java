package org.example.hackerRankProblems;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineNum = 1;

        while (sc.hasNext()){
            System.out.println(lineNum + " " + sc.nextLine());
            lineNum++;
        }
        sc.close();
    }
}
