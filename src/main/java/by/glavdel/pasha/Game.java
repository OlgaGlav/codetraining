package by.glavdel.pasha;

import java.util.Arrays;

public class Game {
    public Game() {
    }

    public static void main(String[] args) {
        int[][] field = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}};
        int[][] newGeneration = newState(field);
        System.out.println(Arrays.deepToString(newGeneration));
    }

    public static int[][] newState(int[][] field) {
        int[][] newGeneration = new int[field.length][field[0].length];

        for (int i = 0; i < field.length; ++i) {
            for (int j = 0; j < field[i].length; ++j) {
                int sum = countNeighbors(field, i, j);
                newGeneration[i][j] = analizeState(sum, field[i][j]);
            }
        }
        return newGeneration;
    }

    private static int countNeighbors(int[][] field, int i, int j) {
        int sum = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            if (k >= 0 && k < field.length) {
                for (int l = j - 1; l <= j + 1; l++) {
                    if (l >= 0 && l < field[0].length) {
                        sum += field[k][l];
                    }
                }
            }
        }
        return sum - field[i][j];
    }

    private static int analizeState(int sum, int element) {
        return sum != 3 && (sum != 2 || element != 1) ? 0 : 1;
    }
}

