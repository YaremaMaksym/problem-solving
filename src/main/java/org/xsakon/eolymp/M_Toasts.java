package org.xsakon.eolymp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M_Toasts {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        if (n % k == 0) System.out.println(n / k * 4);
        else System.out.println(n / k * 4 + 4);

        in.close();
    }
}