package BasicSyntaxConditionalStatementsandLoopsMoreFULL;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double spent = 0;
        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }
            if (balance >= price) {
                System.out.printf("Bought %s%n", input);
                balance -= price;
                spent += price;
                if (balance == 0) {
                    System.out.println("Out of money!");
                    break;
                }

            } else {
                System.out.println("Too Expensive");
            }

            input = scanner.nextLine();
        }
        if (balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
        }
    }
}