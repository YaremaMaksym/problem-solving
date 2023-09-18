package org.xsakon.eolymp;

/*
3 4
1 2 3 4
5 6 7 8
9 10 11 12

3 5
1 2 3 4 5
5 4 3 2 1
2 3 1 5 4
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_PartialSumOfMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] matrix = new int[n][m];

        for (int i = 0; i <n; i++) {
            s = in.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) ; // this element stays the same
                else if (i == 0) matrix[i][j] += matrix[i][j - 1];
                else if (j == 0) matrix[i][j] += matrix[i - 1][j];
                else matrix[i][j] += matrix[i][j - 1] + matrix[i - 1][j] - matrix[i - 1][j - 1];

                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        in.close();
    }
}
