package ConditionalStatementsAdvancedFINISHED.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {
            switch (product) {
                case ("banana"):
                    price = 2.50;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "apple":
                    price = 1.20;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "orange":
                    price = 0.85;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "grapefruit":
                    price = 1.45;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "kiwi":
                    price = 2.70;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "pineapple":
                    price = 5.50;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "grapes":
                    price = 3.85;
                    System.out.printf("%.2f",quantity * price);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (product) {
                case "banana":
                    price = 2.70;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "apple":
                    price = 1.25;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "orange":
                    price = 0.90;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "grapefruit":
                    price = 1.60;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "kiwi":
                    price = 3.00;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "pineapple":
                    price = 5.60;
                    System.out.printf("%.2f",quantity * price);
                    break;
                case "grapes":
                    price = 4.20;
                    System.out.printf("%.2f",quantity * price);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

    }
}
