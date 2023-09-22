package org.xsakon.eolymp.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class G_Permutation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        generatePermutations(list);
        in.close();
    }

    public static void generatePermutations(List<Integer> list) {
        int size = list.size();

        while (true) {
            printList(list);

            int i = size - 2;
            while (i >= 0 && list.get(i) >= list.get(i + 1)) {
                i--;
            }

            if (i == -1) {
                break;
            }

            int j = size - 1;
            while (list.get(j) <= list.get(i)) {
                j--;
            }

            Collections.swap(list, i, j);

            reverseSublist(list, i + 1, size - 1);
        }
    }

    public static void reverseSublist(List<Integer> list, int start, int end) {
        while (start < end) {
            Collections.swap(list, start, end);
            start++;
            end--;
        }
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
