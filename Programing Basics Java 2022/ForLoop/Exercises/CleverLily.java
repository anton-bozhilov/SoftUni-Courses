package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthdays = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int toys = 0;
        int gift = 0;

        for (int i = 1; i <= birthdays; i++) {
            if (i % 2 == 0) {
                gift += 10;
                sum = sum + (gift - 1);
            } else {
                toys++;
            }
        }
        double savedMoney = (toys * pricePerToy) + sum;
        if (savedMoney >= priceWasher) {
            System.out.printf("Yes! %.2f", savedMoney - priceWasher);
        } else {
            System.out.printf("No! %.2f", priceWasher - savedMoney);
        }


    }
}
