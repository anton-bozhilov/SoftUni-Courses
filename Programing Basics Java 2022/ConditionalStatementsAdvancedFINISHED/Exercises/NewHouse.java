package ConditionalStatementsAdvancedFINISHED.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double roses = 5.00;
        double dahlias = 3.80;
        double tulips = 2.80;
        double narcissus = 3.00;
        double gladiolus = 2.50;
        double totalSum = 0.0;

        switch (flower) {
            case "Roses":
                if (countFlowers > 80) {
                    totalSum = (roses * countFlowers) * 0.90;
                } else {
                    totalSum = roses * countFlowers;
                }
                break;
            case "Dahlias":
                if (countFlowers > 90) {
                    totalSum = (dahlias * countFlowers) * 0.85;
                } else {
                    totalSum = dahlias * countFlowers;
                }
                break;
            case "Tulips":
                if (countFlowers > 80) {
                    totalSum = (tulips * countFlowers) * 0.85;
                } else {
                    totalSum = tulips * countFlowers;
                }
                break;
            case "Narcissus":
                if (countFlowers < 120) {
                    totalSum = (narcissus * countFlowers) * 1.15;
                } else {
                    totalSum = narcissus * countFlowers;
                }
                break;
            case "Gladiolus":
                if (countFlowers < 80) {
                    totalSum = (gladiolus * countFlowers) * 1.20;
                } else {
                    totalSum = gladiolus * countFlowers;
                }
                break;
        }
        if (totalSum <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s" +
                    " and %.2f leva left.", countFlowers, flower, (budget - totalSum));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalSum - budget);
        }
    }
}
