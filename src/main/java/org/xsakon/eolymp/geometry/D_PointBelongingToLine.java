package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_PointBelongingToLine {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        double x = Double.parseDouble(s[0]);
        double y = Double.parseDouble(s[1]);
        double a = Double.parseDouble(s[2]);
        double b = Double.parseDouble(s[3]);
        double c = Double.parseDouble(s[4]);

        if (a * x + b * y + c == 0) System.out.println("YES");
        else System.out.println("NO");

        in.close();
    }
}
