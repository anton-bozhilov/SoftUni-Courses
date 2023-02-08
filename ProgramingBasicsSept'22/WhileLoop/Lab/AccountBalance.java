package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {
            double current = Double.parseDouble(input);
            if (current < 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }
            System.out.printf("Increase: %.2f%n", current);
            total = total + current;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
