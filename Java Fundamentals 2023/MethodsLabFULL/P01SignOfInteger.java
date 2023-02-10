package MethodsLabFULL;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printSign(numberInput);
    }

    public static void printSign(int number) {
        String sign = "";
        if (number < 0) {
            sign = "negative";
        } else if (number > 0) {
            sign = "positive";
        } else {
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", number, sign);
    }

}
