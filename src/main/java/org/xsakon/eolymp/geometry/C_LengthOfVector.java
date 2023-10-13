package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class C_LengthOfVector {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        double x1 = Double.parseDouble(s[0]);
        double y1 = Double.parseDouble(s[1]);
        double x2 = Double.parseDouble(s[2]);
        double y2 = Double.parseDouble(s[3]);

        double x = x2 - x1;
        double y = y2 - y1;

        double length = Math.hypot(x, y);

        System.out.printf(Locale.US, "%.6f", length);
        in.close();
    }
}
