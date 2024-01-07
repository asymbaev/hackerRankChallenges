package org.example.hackerRankProblems;
import java.util.Scanner;
import java.util.stream.Stream;

public class StaticInBlock {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        flag = Stream.of(B, H)
                .noneMatch(value -> value <= 0);

        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
