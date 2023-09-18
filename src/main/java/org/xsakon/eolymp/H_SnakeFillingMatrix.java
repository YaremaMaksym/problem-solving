package org.xsakon.eolymp;

import java.util.Scanner;

public class H_SnakeFillingMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        StringBuilder strOut = new StringBuilder();

        int[][] matrix = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            if ((i + 1) % 2 == 1) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = ++count;
                }
            }
            else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = ++count;
                }
            }
        }

        for (int[] arr : matrix) {
            for (int number : arr) {
                strOut.append(number).append(" ");
            }
            strOut.append("\n");
        }

        System.out.println(strOut);

        in.close();
    }
}
