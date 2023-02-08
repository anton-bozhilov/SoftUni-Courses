package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;

        boolean isValid = false;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                count++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, i + j);
                    isValid = true;
                    break;
                }

            }if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}

