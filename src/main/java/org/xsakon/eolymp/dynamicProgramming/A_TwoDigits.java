package org.xsakon.eolymp.dynamicProgramming;

import java.util.*;

public class A_TwoDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(countNumberOfCombinations(n + 1) * 2);

        in.close();
    }

    static public int countNumberOfCombinations(int n) {
        if (n <= 2) return 1;
        return countNumberOfCombinations(n - 1) + countNumberOfCombinations(n - 2);
    }
}
