package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_StephenAndGum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");

        int t1 = Integer.parseInt(s[0]);
        int t2 = Integer.parseInt(s[1]);

        System.out.println(lcm(t1, t2));
        in.close();
    }
    
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    static long gcd(long a, long b) {
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        return a + b;
    }
}
