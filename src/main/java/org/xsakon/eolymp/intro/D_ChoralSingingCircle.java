package org.xsakon.eolymp.intro;

import java.io.IOException;
import java.util.Scanner;

public class D_ChoralSingingCircle {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();

            if (gcd(n, m) == 1) System.out.println("YES");
            else System.out.println("NO");
        }

        in.close();
    }

    static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }
}
