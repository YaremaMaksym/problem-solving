package org.xsakon.eolymp;

import java.util.Scanner;

public class K_CountZerosInTheEndOfFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

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
    }
}