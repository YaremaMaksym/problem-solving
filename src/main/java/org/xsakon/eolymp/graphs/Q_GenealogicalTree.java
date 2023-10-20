package org.xsakon.eolymp.graphs;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q_GenealogicalTree {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            while (true) {
                int j = in.nextInt();
                if (j == 0) break;
                a[i][j - 1] = 1;
            }
        }

//        for (int[] ints : a) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        Set<Integer> set = new HashSet<>();
        while (set.size() < n) {
            for (int i = 0; i < n; i++) {
                if(!set.contains(i)) {
                    boolean check = isAllZerosInRow(a, i);
                    if (check) {
                        set.add(i);
                        System.out.print((i + 1) + " ");
                        fillColumnWithZeros(a, i);
                    }
                }
            }
        }
    }

    static void fillColumnWithZeros(int[][] a, int i) {
        for (int j = 0; j < a.length; j++) {
            a[i][j] = 0;
        }
    }

    static boolean isAllZerosInRow(int[][] a, int j) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][j] != 0) return false;
        }
        return true;
    }
}
