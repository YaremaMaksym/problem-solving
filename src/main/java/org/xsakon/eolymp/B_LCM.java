package org.xsakon.eolymp;

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

    static int lcmOfMultipleNumbers(int[] arr) {
        int lcm = arr[0];

        for (int i = 0; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    static int lcm(int a, int b) {
        return a * b / gcd2(a, b);
    }

    static int gcd1(int a, int b) {
        while (a != b) {
            if (a > b) a -=b;
            else b -=a;
        }

        return a;
    }

    static int gcd2(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a %=b;
            else b %=a;
        }

        return a + b;
    }
}
