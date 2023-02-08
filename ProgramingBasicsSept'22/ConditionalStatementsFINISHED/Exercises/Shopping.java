package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int procerssors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double pricevideocars = videocards * 250;
        double priceprocessors = procerssors * (pricevideocars * 0.35);
        double priceRam = ram * (pricevideocars * 0.1);
        double finalSum = priceprocessors + pricevideocars + priceRam;

        if (videocards > procerssors) {
            finalSum = finalSum * 0.85;
        }
        if (budget >= finalSum) {
            System.out.printf("You have %.2f leva left!", budget - finalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalSum - budget);
        }


    }
}
