package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_GCD {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        int[] arr = new int[size];

        String[] s = in.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(gcdOfMultipleNumbers(arr));
        in.close();
    }

    static int gcdOfMultipleNumbers(int[] arr) {
        int gcd = arr[0];

        for (int n : arr) {
            gcd = gcd(gcd, n);
        }
        return gcd;
    }

    static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }
}
