package org.xsakon.eolymp;

import java.util.Scanner;

public class A_MirrorPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(countMirrorPrimeNumbers(a, b));
        scanner.close();
    }

    static int countMirrorPrimeNumbers(int a, int b) {
        int count = 0;

        while (a <= b) {
            if (isPrime(a) && isPrime(mirrorNumber(a))) count++;
            a++;
        }

        return count;
    }

    static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static int mirrorNumber(int n) {
        int mirroredN = 0;

        while (n / 10 > 0 || n % 10 != 0) {
            mirroredN *= 10;
            mirroredN += n % 10;

            n /= 10;
        }

        return mirroredN;
    }
}
