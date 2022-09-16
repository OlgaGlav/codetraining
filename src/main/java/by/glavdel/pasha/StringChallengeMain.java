package by.glavdel.pasha;

import java.util.Scanner;

public class StringChallengeMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(stringChallenge(s.nextLine()));
    }

    public static String stringChallenge(String line) {
        StringBuilder newLine = new StringBuilder(line.substring(0, 1));
        for (int i = 0; i < line.length() - 1; i++) {
            String connector = stringChallenge(Integer.parseInt(line.substring(i, i + 2)));
            newLine.append(connector).append(line.charAt(i + 1));
        }
        return newLine.toString();
    }

    public static String stringChallenge(int num) {
        int firstNumber = num / 10;
        int secondNumber = num % 10;
        int sum = firstNumber + secondNumber;
        if (firstNumber != 0 && secondNumber != 0) {
            if (sum % 2 == 0 && firstNumber % 2 == 0) {
                return "*";
            }
            if (sum % 2 == 0) {
                return "-";
            }
        }
        return "";
    }
}
