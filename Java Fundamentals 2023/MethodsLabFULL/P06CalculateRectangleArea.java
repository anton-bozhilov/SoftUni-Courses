package MethodsLabFULL;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateArea(firstNumInput, secondNumInput));
    }

    public static int calculateArea(int first, int second) {
        return first * second;
    }
}
