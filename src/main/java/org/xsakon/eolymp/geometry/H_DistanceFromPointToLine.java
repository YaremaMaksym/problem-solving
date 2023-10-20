package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class H_DistanceFromPointToLine {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int xPoint = Integer.parseInt(s[0]);
        int yPoint = Integer.parseInt(s[1]);
        int x1 = Integer.parseInt(s[2]);
        int y1 = Integer.parseInt(s[3]);
        int x2 = Integer.parseInt(s[4]);
        int y2 = Integer.parseInt(s[5]);

        int a = y2 - y1;
        int b = x1 - x2;
        int c = x2 * y1 - x1 * y2;

        double distance = 0;

        distance = Math.abs(a * xPoint + b * yPoint + c) / Math.hypot(a, b);

        System.out.printf(Locale.US, "%.6f", distance);

        in.close();
    }
}
