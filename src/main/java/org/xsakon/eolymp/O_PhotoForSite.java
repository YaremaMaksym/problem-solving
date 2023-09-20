package org.xsakon.eolymp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class O_PhotoForSite {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        double a = Integer.parseInt(s[0]);
        double b = Integer.parseInt(s[1]);
        double m = Integer.parseInt(s[2]);
        double n = Integer.parseInt(s[3]);

        double maxA = 0;
        double maxB = 0;
        double aspectRatio = a / b;

        double width = 0;
        double height = 0;

        if (a < b) {
            width = Math.min(n, m);
            height = Math.max(n, m);

            if (width / height < aspectRatio) {
                maxA = width;
                maxB = maxA / aspectRatio;
            }
            else {
                maxB = height;
                maxA = maxB * aspectRatio;
            }
        }
        else {
            width = Math.max(n, m);
            height = Math.min(n, m);

            if (width / height < aspectRatio) {
                maxA = width;
                maxB = maxA / aspectRatio;

            } else {
                maxB = height;
                maxA = maxB * aspectRatio;
            }
        }

        System.out.printf(Locale.US, "%.3f %.3f", maxA, maxB);
        in.close();
    }
}
