package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_LineExpression2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int x1 = Integer.parseInt(s[0]);
        int y1 = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);
        int b = Integer.parseInt(s[3]);

        int c = - a * x1 - b * y1;
        System.out.println(a + " " + b + " " + c);
        in.close();
    }
}
