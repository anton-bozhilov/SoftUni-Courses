package NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            String current = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 1; j <= current.length(); j++) {
                int currentDigit = Integer.parseInt("" + current.charAt(j - 1));
                if (j % 2 == 0) {
                    evenSum = evenSum + currentDigit;
                } else {
                    oddSum = oddSum + currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.printf("%s ", current);
            }
        }
    }
}
