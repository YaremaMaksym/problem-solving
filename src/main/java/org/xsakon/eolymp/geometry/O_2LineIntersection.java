package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O_2LineIntersection {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int a1 = Integer.parseInt(s[0]);
        int b1 = Integer.parseInt(s[1]);
        int c1 = Integer.parseInt(s[2]);
        int a2 = Integer.parseInt(s[3]);
        int b2 = Integer.parseInt(s[4]);
        int c2 = Integer.parseInt(s[5]);

        double determinant = a1 * b2 - a2 * b1;

        double x = (b1 * c2 - b2 * c1) / determinant;
        double y = (c1 * a2 - c2 * a1) / determinant;

        System.out.printf("%.2f %.2f", x, y);

        in.close();
    }
}
