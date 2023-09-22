package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_DivisibilityByThree {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int count = n / 3 * 2;
        count += (n % 3 > 1) ? n % 3 - 1 : 0;

        System.out.println(count);
        in.close();
    }
}
