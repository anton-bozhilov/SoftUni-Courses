package ConditionalStatementsAdvancedFINISHED.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double vip = 499.99;
        double normal = 249.99;
        double transport = 0.0;
        double price = 0.0;

        if (people <= 4) {
            transport = budget * 0.75;
        } else if (people <= 9) {
            transport = budget * 0.60;
        } else if (people <= 24) {
            transport = budget * 0.50;
        } else if (people <= 49) {
            transport = budget * 0.40;
        } else {
            transport = budget * 0.25;
        }
        double budgetFinal = budget - transport;

        switch (category) {
            case "VIP":
                price = people * vip;
                break;
            case "Normal":
                price = people * normal;
                break;
        }
        if (budgetFinal >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budgetFinal - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budgetFinal);
        }


    }
}
