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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            result.append(arr[i]).append(" ");
        }
        return result.toString().trim();
    }
}
