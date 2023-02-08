package WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        double available = Double.parseDouble(scanner.nextLine());

        int totalDays = 0;
        int spendDays = 0;

        while (available < priceExcursion && spendDays < 5) {
            String type = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            totalDays++;
            if (type.equals("spend")) {
                spendDays++;
                available = available - money;
                if (available < 0) {
                    available = 0;
                }
            } else if (type.equals("save")) {
                available = available + money;
                spendDays = 0;
            }
        }
        if (available>=priceExcursion) {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", totalDays);
        }
    }
}
