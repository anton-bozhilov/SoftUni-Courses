package MethodsLabFULL;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(numberInput));

    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumEvenNum(number);
        int oddSum = getSumOddNum(number);
        return evenSum * oddSum;
    }

    public static int getSumEvenNum(int num) {
        int sum = 0;
        while (num > 0) {
            int current = num % 10;
            if (current % 2 == 0) {
                sum += current;
            }
            num = num / 10;
        }
        return sum;
    }

    public static int getSumOddNum(int num) {
        int sum = 0;
        while (num > 0) {
            int current = num % 10;
            if (current % 2 != 0) {
                sum += current;
            }
            num = num / 10;
        }
        return sum;
    }
}
