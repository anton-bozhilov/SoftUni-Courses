package DataTypesAndVariablesLabFull;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.3f", pounds * 1.36);
    }
}
