package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destitation = input;
            double price = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum<price) {
                double ammount = Double.parseDouble(scanner.nextLine());
                sum = sum + ammount;
            }
            System.out.printf("Going to %s!%n", destitation);
            input = scanner.nextLine();
        }
    }
}
