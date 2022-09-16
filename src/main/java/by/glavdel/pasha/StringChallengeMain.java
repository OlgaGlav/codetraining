package by.glavdel.pasha;

import java.util.Scanner;

public class StringChallengeMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(StringChallenge(s.nextLine()));
    }

    public static String StringChallenge(String line) {
        StringBuilder newLine = new StringBuilder(line.substring(0, 1));
        for (int i = 0; i < line.length() - 1; i++) {
            int result = StringChallenge(Integer.parseInt(line.substring(i, i + 2)));
            switch (result) {
                case (1):
                    newLine.append("*").append(line.charAt(i + 1));
                    break;
                case (2):
                    newLine.append("-").append(line.charAt(i + 1));
                    break;
                case (0):
                    newLine.append(line.charAt(i + 1));
                    break;
            }
        }
        return newLine.toString();
    }

    public static int StringChallenge(int num) {
        int firstNumber = num / 10;
        int secondNumber = num % 10;
        int sum = firstNumber + secondNumber;
        if (firstNumber != 0 && secondNumber != 0) {
            if (sum % 2 == 0 && firstNumber % 2 == 0) {
                return 1;
            }
            if (sum % 2 == 0) {
                return 2;
            }
        }
        return 0;
    }
}
