package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_DistanceFromPointToLine {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        double xo = Double.parseDouble(s[0]);
        double yo = Double.parseDouble(s[1]);
        double a = Double.parseDouble(s[2]);
        double b = Double.parseDouble(s[3]);
        double c = Double.parseDouble(s[4]);

        double distance = Math.abs(a * xo + b * yo + c) / Math.sqrt(a * a + b * b);

        System.out.printf("%.6f", distance);

        in.close();
    }
}
