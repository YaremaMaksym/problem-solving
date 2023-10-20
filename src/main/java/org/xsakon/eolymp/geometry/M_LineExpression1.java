package org.xsakon.eolymp.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M_LineExpression1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int x1 = Integer.parseInt(s[0]);
        int y1 = Integer.parseInt(s[1]);
        int x2 = Integer.parseInt(s[2]);
        int y2 = Integer.parseInt(s[3]);

        int a = y2 - y1;
        int b = x1 - x2;
        int c = x2 * y1 - x1 * y2;
        System.out.println(a + " " + b + " " + c);
        in.close();
    }
}
