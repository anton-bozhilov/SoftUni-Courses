package MethodsExercisesFULL;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double sum = factorialOfNumber(num1) * 1.0 / factorialOfNumber(num2);
        System.out.printf("%.2f", sum);
    }

    public static long factorialOfNumber(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
