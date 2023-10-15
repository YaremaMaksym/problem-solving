package org.xsakon.eolymp.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_SubSequences {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int[] arr = new int[n];
        String[] s = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int[] lengths = new int[n];
        Arrays.fill(lengths, 1);


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j] && lengths[i] < lengths[j] + 1) {
                    lengths[i] = lengths[j] + 1;
                }

            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (lengths[i] > max) max = lengths[i];
        }

        System.out.println(max);

        in.close();
    }
}