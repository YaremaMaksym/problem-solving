package org.xsakon.eolymp;

/*
3
1 1 1 1 1 1 1 1 2 2 2 2
3 3 3 3 10 10 10 10 5 5 5 5
4 4 4 4 10 10 10 9 6 6 6 6

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_StephenAndMatches {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            int[] arr = new int[12];

            for (int j = 0; j < 12; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }

            if (canFormParallelepiped(arr)) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
        in.close();
    }


    public static boolean canFormParallelepiped(int[] arr) {
        Arrays.sort(arr);

        int pairs = 0;
        for (int i = 0; i < 11; i++) {
            if (arr[i] == arr[i + 1]) {
                pairs++;
                i++;
            }
        }

        return pairs == 6;
    }
}
