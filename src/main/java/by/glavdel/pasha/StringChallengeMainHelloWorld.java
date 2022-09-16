package by.glavdel.pasha;

import java.util.Scanner;

public class StringChallengeMainHelloWorld {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(stringChallengee(s.nextLine()));
    }

    public static String stringChallengee(String str) {
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return result.toString().trim();
    }
}
