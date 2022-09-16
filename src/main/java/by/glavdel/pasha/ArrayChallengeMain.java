package by.glavdel.pasha;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallengeMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(ArrayChallenge(s.nextLine()));
    }

    private static int ArrayChallenge(String line) {
        String[] arrString = line.trim().split(",");
        int[] arr = new int[arrString.length];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.parseInt(arrString[i]);
        }

        return ArrayChallenge(arr);
    }

    public static int ArrayChallenge(int[] arr) {
        Arrays.sort(arr);
        int element = -1;
        int countBase = 0;

        for (int i = 0; i < arr.length - 1; ++i) {
            int count = 1;

            for (int j = i; j < arr.length - 1; ++j) {
                if (arr[j] == arr[j + 1]) {
                    ++count;
                } else {
                    i = j + 1;
                    if (count > countBase) {
                        countBase = count;
                        element = arr[j];
                    }
                    count = 1;
                }
            }
        }
        return element;
    }
}

