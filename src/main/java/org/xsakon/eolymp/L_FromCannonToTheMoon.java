package org.xsakon.eolymp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L_FromCannonToTheMoon {
    public static void main(String[] args) throws IOException {
        final int EARTH_X = 0;
        final int EARTH_Y = 0;

        final int MOON_X = 384000;
        final int MOON_Y = 0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        if (x < MOON_X / 2) System.out.println("Earth");
        else System.out.println("Moon");

        in.close();
    }
}
