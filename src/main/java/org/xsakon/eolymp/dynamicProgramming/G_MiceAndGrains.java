package org.xsakon.eolymp.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_MiceAndGrains {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = in.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            s = in.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(s[j]);
            }
        }

        // fill bottom row
        for (int i = 1; i < n; i++) {
            matrix[m - 1][i] += matrix[m - 1][i - 1];
        }

        // fill left column
        for (int i = m - 2; i >= 0; i--) {
            matrix[i][0] += matrix[i + 1][0];
        }

        // fill what's left
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] += Math.max(matrix[i+1][j], matrix[i][j-1]);
            }
        }

        int i = 0;
        int j = n - 1;
        while ((i < m - 1) || (j > 0)) {

            if (j == 0) {
                sb.insert(0, "F");
                i++;
            } else if (i == m - 1) {
                sb.insert(0, "R");
                j--;
            }
            else {
                if (matrix[i + 1][j] > matrix[i][j - 1]) {
                    sb.insert(0, "F");
                    i++;
                }
                else {
                    sb.insert(0, "R");
                    j--;
                }
            }
        }
        
/*
3 3
5 3 2
10 5 70
1 2 3
 */
        System.out.println(sb);
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        in.close();
    }
}
