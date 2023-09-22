package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//not valid 111, 000
//valid 001, 010, 100, 101

public class Q_BaghdadPassport {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int min = (n % 3 == 0) ? n / 3 : n / 3 + 1;
        int max = n / 2;

        System.out.println(min + " " + max);

        in.close();
    }
}
