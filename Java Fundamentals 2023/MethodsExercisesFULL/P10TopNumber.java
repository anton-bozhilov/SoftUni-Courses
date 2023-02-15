package MethodsExercisesFULL;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= numInput; number++) {
            if (isDivisible(number) && existingOdd(number)) {
                System.out.println(number);
            }

        }

    }

    public static boolean isDivisible(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        return (sum) % 8 == 0;
    }

    public static boolean existingOdd(int num) {
        boolean isOdd = false;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                isOdd = true;
                break;
            }
            num = num / 10;
        }
        return isOdd;
    }
}
