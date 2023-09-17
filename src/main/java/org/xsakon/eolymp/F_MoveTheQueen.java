package org.xsakon.eolymp;
// 3 1 6 1 7 4 8 3 5 1 1 1 1 1 1 1 1 2 4 6 8 3 2 7 5
// 171

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class F_MoveTheQueen {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int numTestCases = Integer.parseInt(s[0]);

        StringBuilder out = new StringBuilder();

        List<List<Integer>> positionCases = new ArrayList<>();
        List<List<Integer>> solutions = getSolutions();

        for (int i = 0; i < numTestCases; i++) {
            positionCases.add(new ArrayList<>(8));

            for (int j = 0; j < 8; j++) {
                int n = Integer.parseInt(s[1 + i * 8 + j]);
                positionCases.get(i).add(n - 1);
            }

            out.append(countDifferencesWithMostSimilar(solutions, positionCases.get(i)));
        }

        System.out.println(out);
        in.close();
    }


/*
    private static void generateAllQueenProblemSolutions(int n, int row, List<Integer> columns, List<List<Integer>> solutions) {
        if (row == n) {
            solutions.add(new ArrayList<>(columns));
        } else {
            for (int col = 0; col < n; col++) {
                if (isValid(columns, row, col)) {
                    columns.add(col);
                    generateAllQueenProblemSolutions(n, row + 1, columns, solutions);
                    columns.remove(columns.size() - 1);
                }
            }
        }
    }

    private static boolean isValid(List<Integer> columns, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = columns.get(prevRow);

            if (prevCol == col ||
                    prevCol - prevRow == col - row ||
                    prevCol + prevRow == col + row) {
                return false;
            }
        }

        return true;
    }
*/
    /*
    static List<Integer> findMostSimilar (List<List<Integer>> solutions, List<Integer> placement) {
        int currentDifferences = 0;
        int mostSimiliarDifferences = 8;
        List<Integer> mostSimilar = new ArrayList<>();

        for (int i = 0; i < solutions.size(); i++) {
            currentDifferences = 0;

            for (int j = 0; j < placement.size(); j++) {
                if (!solutions.get(i).get(j).equals(placement.get(j))) currentDifferences++;
            }

            if (currentDifferences == 0) return solutions.get(i);

            if (mostSimiliarDifferences > currentDifferences) {
                mostSimiliarDifferences = currentDifferences;
                mostSimilar = solutions.get(i);
            }
        }

        return mostSimilar;
    }
*/

    static int countDifferencesWithMostSimilar (List<List<Integer>> solutions, List<Integer> placement) {
        int currentDifferences;
        int mostSimiliarDifferences = 8;

        for (int i = 0; i < solutions.size(); i++) {
            currentDifferences = 0;

            for (int j = 0; j < placement.size(); j++) {
                if (!solutions.get(i).get(j).equals(placement.get(j))) currentDifferences++;
            }

            if (currentDifferences == 0) return mostSimiliarDifferences;

            if (mostSimiliarDifferences > currentDifferences) {
                mostSimiliarDifferences = currentDifferences;
            }
        }

        return mostSimiliarDifferences;
    }
    static List<List<Integer>> getSolutions() {
        String solutionsString = """
                0 4 7 5 2 6 1 3\s
                0 5 7 2 6 3 1 4\s
                0 6 3 5 7 1 4 2\s
                0 6 4 7 1 3 5 2\s
                1 3 5 7 2 0 6 4\s
                1 4 6 0 2 7 5 3\s
                1 4 6 3 0 7 5 2\s
                1 5 0 6 3 7 2 4\s
                1 5 7 2 0 3 6 4\s
                1 6 2 5 7 4 0 3\s
                1 6 4 7 0 3 5 2\s
                1 7 5 0 2 4 6 3\s
                2 0 6 4 7 1 3 5\s
                2 4 1 7 0 6 3 5\s
                2 4 1 7 5 3 6 0\s
                2 4 6 0 3 1 7 5\s
                2 4 7 3 0 6 1 5\s
                2 5 1 4 7 0 6 3\s
                2 5 1 6 0 3 7 4\s
                2 5 1 6 4 0 7 3\s
                2 5 3 0 7 4 6 1\s
                2 5 3 1 7 4 6 0\s
                2 5 7 0 3 6 4 1\s
                2 5 7 0 4 6 1 3\s
                2 5 7 1 3 0 6 4\s
                2 6 1 7 4 0 3 5\s
                2 6 1 7 5 3 0 4\s
                2 7 3 6 0 5 1 4\s
                3 0 4 7 1 6 2 5\s
                3 0 4 7 5 2 6 1\s
                3 1 4 7 5 0 2 6\s
                3 1 6 2 5 7 0 4\s
                3 1 6 2 5 7 4 0\s
                3 1 6 4 0 7 5 2\s
                3 1 7 4 6 0 2 5\s
                3 1 7 5 0 2 4 6\s
                3 5 0 4 1 7 2 6\s
                3 5 7 1 6 0 2 4\s
                3 5 7 2 0 6 4 1\s
                3 6 0 7 4 1 5 2\s
                3 6 2 7 1 4 0 5\s
                3 6 4 1 5 0 2 7\s
                3 6 4 2 0 5 7 1\s
                3 7 0 2 5 1 6 4\s
                3 7 0 4 6 1 5 2\s
                3 7 4 2 0 6 1 5\s
                4 0 3 5 7 1 6 2\s
                4 0 7 3 1 6 2 5\s
                4 0 7 5 2 6 1 3\s
                4 1 3 5 7 2 0 6\s
                4 1 3 6 2 7 5 0\s
                4 1 5 0 6 3 7 2\s
                4 1 7 0 3 6 2 5\s
                4 2 0 5 7 1 3 6\s
                4 2 0 6 1 7 5 3\s
                4 2 7 3 6 0 5 1\s
                4 6 0 2 7 5 3 1\s
                4 6 0 3 1 7 5 2\s
                4 6 1 3 7 0 2 5\s
                4 6 1 5 2 0 3 7\s
                4 6 1 5 2 0 7 3\s
                4 6 3 0 2 7 5 1\s
                4 7 3 0 2 5 1 6\s
                4 7 3 0 6 1 5 2\s
                5 0 4 1 7 2 6 3\s
                5 1 6 0 2 4 7 3\s
                5 1 6 0 3 7 4 2\s
                5 2 0 6 4 7 1 3\s
                5 2 0 7 3 1 6 4\s
                5 2 0 7 4 1 3 6\s
                5 2 4 6 0 3 1 7\s
                5 2 4 7 0 3 1 6\s
                5 2 6 1 3 7 0 4\s
                5 2 6 1 7 4 0 3\s
                5 2 6 3 0 7 1 4\s
                5 3 0 4 7 1 6 2\s
                5 3 1 7 4 6 0 2\s
                5 3 6 0 2 4 1 7\s
                5 3 6 0 7 1 4 2\s
                5 7 1 3 0 6 4 2\s
                6 0 2 7 5 3 1 4\s
                6 1 3 0 7 4 2 5\s
                6 1 5 2 0 3 7 4\s
                6 2 0 5 7 4 1 3\s
                6 2 7 1 4 0 5 3\s
                6 3 1 4 7 0 2 5\s
                6 3 1 7 5 0 2 4\s
                6 4 2 0 5 7 1 3\s
                7 1 3 0 6 4 2 5\s
                7 1 4 2 0 6 3 5\s
                7 2 0 5 1 4 6 3\s
                7 3 0 2 5 1 6 4\s""";

        List<List<Integer>> solutions = new ArrayList<>();
        String[] lines = solutionsString.split("\n");

        for (int i = 0; i < 92; i++) {
            solutions.add(new ArrayList<>());
            String[] s = lines[i].split(" ");

            for (int j = 0; j < 8; j++) {
                solutions.get(i).add(Integer.parseInt(s[j]));
            }
        }
        return solutions;
    }
}
