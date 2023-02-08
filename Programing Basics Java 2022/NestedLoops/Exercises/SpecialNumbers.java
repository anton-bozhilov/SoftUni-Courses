package NestedLoops.Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            boolean isSpecial = true;
            int num = i;
            for (int j = 4; j >= 1; j--) {
                int digit = num % 10;
                if (digit == 0) {
                    isSpecial = false;
                    continue;
                }
                if (n % digit != 0) {
                    isSpecial = false;
                }
                num = num / 10;
            }
            if (isSpecial) {
                System.out.printf("%d ", i);
            }
        }
    }
}
