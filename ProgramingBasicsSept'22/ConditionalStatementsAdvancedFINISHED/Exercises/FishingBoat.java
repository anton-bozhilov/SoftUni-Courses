package ConditionalStatementsAdvancedFINISHED.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.0;

        switch (season) {
            case "Spring":
                totalSum = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalSum = 4200;
                break;
            case "Winter":
                totalSum = 2600;
                break;
        }
        if (count <= 6) {
            if ((count % 2 == 1) || (season.equals("Autumn"))) {
                totalSum = totalSum * 0.90;
            } else {
                totalSum = (totalSum * 0.90) * 0.95;
            }
        } else if (count <= 11) {
            if ((count % 2 == 1) || (season.equals("Autumn"))) {
                totalSum = totalSum * 0.85;
            } else {
                totalSum = (totalSum * 0.85) * 0.95;
            }
        } else {
            if ((count % 2 == 1) || (season.equals("Autumn"))) {
                totalSum = totalSum * 0.75;
            } else {
                totalSum = (totalSum * 0.75) * 0.95;
            }
        }
        if (budget >= totalSum) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalSum - budget);
        }
    }
}
