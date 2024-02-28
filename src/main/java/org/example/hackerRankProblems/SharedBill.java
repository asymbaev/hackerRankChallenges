package org.example.hackerRankProblems;

import java.util.List;

public class SharedBill {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Removing the item Anna didn't eat
        bill.remove(k);
        // Calculate the total cost of shared items
        int billCost = bill.stream().mapToInt(Integer::intValue).sum();
        // Divide the total cost by 2
        int sharedCost = billCost / 2;

        if (sharedCost == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - sharedCost);
        }

    }
}
