package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class B_AngleBetweenVectors {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        double x1 = Double.parseDouble(s[0]);
        double y1 = Double.parseDouble(s[1]);
        double x2 = Double.parseDouble(s[2]);
        double y2 = Double.parseDouble(s[3]);

        double scalarProd = x1*x2 + y1*y2;
        double mod1 = Math.hypot(x1, y1);
        double mod2 = Math.hypot(x2, y2);

        double cosAlpha = scalarProd/(mod1*mod2);

        System.out.printf(Locale.US, "%.5f", Math.acos(cosAlpha));
        in.close();
    }
}
