package org.xsakon.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p179LargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,31,30,34,5,9,20};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums) {
        StringBuilder res = new StringBuilder();

        List<String> numStrings = Arrays.stream(nums).asLongStream()
                .mapToObj(Long::toString)
                .sorted((n1, n2) -> {
                    String order1 = n1 + n2;
                    String order2 = n2 + n1;
                    return order2.compareTo(order1);
                })
                .toList();

        if (numStrings.get(0).equals("0")) return "0";

        for (String numString : numStrings) {
            res.append(numString);
        }
        return res.toString();
    }
}
