package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class A_PolarAngle {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(" ");

        double x = Double.parseDouble(line[0]);
        double y = Double.parseDouble(line[1]);

        double r = Math.hypot(x, y);

        double alpha = Math.acos(x/r);

        System.out.printf(Locale.US, "%.6f", alpha);
        in.close();
    }
}
