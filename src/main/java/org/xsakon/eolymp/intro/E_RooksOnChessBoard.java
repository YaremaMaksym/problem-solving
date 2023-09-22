package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class E_RooksOnChessBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = BigInteger.valueOf(Long.parseLong(in.readLine()));

        System.out.println(factorial(n));
        in.close();
    }

    public static BigInteger factorial (BigInteger n) {
        if (n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        else return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
