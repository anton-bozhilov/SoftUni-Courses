package MethodsLabFULL;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        String symbolInput = scanner.nextLine();
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(calculateResult(symbolInput, firstNumInput, secondNumInput)));
    }

    public static double calculateResult(String symbol, int first, int second) {
        double result = 0;
        switch (symbol) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first * 1.0 / second;
                break;

        }
        return result;
    }
}
