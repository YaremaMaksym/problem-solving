package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K_CountZerosInTheEndOfFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int multipleFive = 1;
        int count = 0;

        while(multipleFive <= n) {
            multipleFive *= 5;
        }
        multipleFive /= 5;

        while (multipleFive > 1) {
            count += n / multipleFive;
            multipleFive /= 5;
        }

        System.out.println(count);
        in.close();
    }
}