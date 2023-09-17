package org.xsakon.eolymp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_ChoralSingingCircle {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        String[] s = in.readLine().split(" ");

        while (s.length > 1) {
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);

            if (m == 1) out.append("YES\n");
            else out.append("NO\n");

            s = in.readLine().split(" ");
        }

        System.out.println(out);
        in.close();
    }
}
