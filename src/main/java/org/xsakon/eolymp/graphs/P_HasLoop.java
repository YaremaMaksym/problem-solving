package org.xsakon.eolymp.graphs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P_HasLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        boolean hasLoop = false;

        for (int i = 0; i < n; i++) {
            if (hasLoop_Dfs(a, i, new HashSet<>(), new HashSet<>())) {
                hasLoop = true;
                break;
            }
        }

        if (hasLoop) System.out.println(1);
        else System.out.println(0);

        in.close();
    }

    static boolean hasLoop_Dfs(int[][] matrix, int node, Set<Integer> visited, Set<Integer> stack) {
        if (stack.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        stack.add(node);

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[node][j] != 0) {
                boolean check = hasLoop_Dfs(matrix, j, visited, stack);
                if (check) return true;
            }
        }

        stack.remove(node);
        return false;
    }
}
