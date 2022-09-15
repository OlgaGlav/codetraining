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
                int sum = 0;
                if (i != 0 && j != 0 && i != field.length - 1 && j != field[i].length - 1) {
                    sum = newStateForCenter(field, i, j);
                } else {
                    sum = newStateForBorder(field, i, j);
                }

                newGeneration[i][j] = analizeState(sum, field[i][j]);
            }
        }

        return newGeneration;
    }

    private static int analizeState(int sum, int element) {
        return sum != 3 && (sum != 2 || element != 1) ? 0 : 1;
    }

    private static int newStateForCenter(int[][] field, int i, int j) {
        return field[i - 1][j - 1] + field[i - 1][j] + field[i - 1][j + 1] + field[i][j - 1] + field[i][j + 1] + field[i + 1][j - 1] + field[i + 1][j] + field[i + 1][j + 1];
    }

    private static int newStateForBorder(int[][] field, int i, int j) {
        int koefI = 1;
        int koefJ = 1;
        int sum = 0;
        if (i != 0) {
            koefI = -1;
        }

        if (j != 0) {
            koefJ = -1;
        }

        if (i == 0 && j == 0 || i == field.length - 1 && j == 0 || i == 0 && j == field[0].length - 1 || i == field.length - 1 && j == field[0].length - 1) {
            sum = field[i + koefI][j] + field[i][j + koefJ] + field[i + koefI][j + koefJ];
        } else if (i != 0 && i != field.length - 1) {
            if (j == 0 || j == field[0].length - 1) {
                sum = field[i - koefI][j] + field[i + koefI][j] + field[i - koefI][j + koefJ] + field[i][j + koefJ] + field[i + koefI][j + koefJ];
            }
        } else {
            sum = field[i][j + koefJ] + field[i][j - koefJ] + field[i + koefI][j - koefJ] + field[i + koefI][j] + field[i + koefI][j + koefJ];
        }

        return sum;
    }
}

