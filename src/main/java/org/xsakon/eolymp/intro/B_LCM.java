package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_LCM {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        int[] arr = new int[size];
        String[] s = in.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(lcmOfMultipleNumbers(arr));
    }

    static long lcmOfMultipleNumbers(int[] arr) {
        long lcm = arr[0];

        for (int i = 0; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    static long gcd(long a, long b) {
        while (a != 0 && b != 0) {
            if (a > b) a %=b;
            else b %=a;
        }

        return a + b;
    }
}