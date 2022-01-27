package com.training.example.life;

import java.util.Arrays;

public class life {
    private static void displayMultiTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    private static int resultCount(int count, int cell) {
        if ((cell == 0 && count == 3) || (cell == 1 && count >= 2 && count <= 3)) {
            return 1;
        } else {
            return 0;
        }
    }

    private static void evolve(int[][] table) {
        int length1 = table.length;
        int length2 = table[0].length;
        int[][] resultTable = new int[length1][length2];
        int count = 0;
        for (int i = 0; i < length1; i++) {
            int j = 0;
            if (i == 0) {
                count = table[i][j+1]
                        + table[i+1][j]
                        + table[i+1][j+1];
                resultTable[i][j] = resultCount(count, table[i][j]);
                for (j = 1; j < (length2 - 1); j++) {
                    count = table[i][j-1]
                            + table[i][j]
                            + table[i][j+1]
                            + table[i+1][j-1]
                            + table[i+1][j]
                            + table[i+1][j+1];
                    resultTable[i][j] = resultCount(count, table[i][j]);
                }
                count = table[i][j-1]
                        + table[i+1][j-1]
                        + table[i+1][j];
                resultTable[i][j] = resultCount(count, table[i][j]);
            } else if (i == length1 -1) {
                count = table[i-1][j]
                        + table[i-1][j+1]
                        + table[i][j+1];
                resultTable[i][j] = resultCount(count, table[i][j]);
                for (j = 1; j < (length2 - 1); j++) {
                    count = table[i-1][j-1]
                            + table[i-1][j]
                            + table[i-1][j+1]
                            + table[i][j-1]
                            + table[i][j]
                            + table[i][j+1];
                    resultTable[i][j] = resultCount(count, table[i][j]);
                }
                count = table[i-1][j-1]
                        + table[i-1][j]
                        + table[i][j-1];
                resultTable[i][j] = resultCount(count, table[i][j]);
            } else {
                count = table[i-1][j]
                        + table[i-1][j+1]
                        + table[i][j+1]
                        + table[i+1][j]
                        + table[i+1][j+1];
                resultTable[i][j] = resultCount(count, table[i][j]);
                for (j = 1; j < (length2 - 1); j++) {
                    count = table[i-1][j-1]
                            + table[i-1][j]
                            + table[i-1][j+1]
                            + table[i][j-1]
                            + table[i][j]
                            + table[i][j+1]
                            + table[i+1][j-1]
                            + table[i+1][j]
                            + table[i+1][j+1];
                    resultTable[i][j] = resultCount(count, table[i][j]);
                }
                count = table[i-1][j-1]
                        + table[i-1][j]
                        + table[i][j-1]
                        + table[i+1][j-1]
                        + table[i+1][j];
                resultTable[i][j] = resultCount(count, table[i][j]);
            }
        }
        displayMultiTable(resultTable);
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        int[][] test1 = {
                {1,0,0},
                {0,0,1},
                {0,1,0}
        };

        displayMultiTable(test1);
        System.out.println("---------------------");
        evolve(test1);
    }
}
