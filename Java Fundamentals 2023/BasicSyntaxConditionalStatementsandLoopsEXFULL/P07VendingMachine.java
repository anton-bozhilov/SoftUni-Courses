package BasicSyntaxConditionalStatementsandLoopsEXFULL;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // трябва да изчислим цялата поръчка

        String input = scanner.nextLine();
        double totalSum = 0;

        while (!input.equals("Start")) {
            double current = Double.parseDouble(input);

            if (current != 0.1 && current != 0.2 && current != 0.5 && current != 1 && current != 2) {
                System.out.printf("Cannot accept %.2f%n", current);
            } else {
                totalSum += current;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            //The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively
            switch (input) {
                case "Nuts":
                    double priceNuts = 2.0;
                    if (totalSum >= priceNuts) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= priceNuts;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Water":
                    double priceWater = 0.7;
                    if (totalSum >= priceWater) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= priceWater;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Crisps":
                    double priceCrisps = 1.5;
                    if (totalSum >= priceCrisps) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= priceCrisps;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Soda":
                    double priceSoda = 0.8;
                    if (totalSum >= priceSoda) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= priceSoda;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Coke":
                    double priceCoke = 1.0;
                    if (totalSum >= priceCoke) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= priceCoke;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                default:
                System.out.println("Invalid product");
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);


    }
}
