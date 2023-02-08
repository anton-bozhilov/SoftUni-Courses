package BasicSyntaxConditionalStatementsandLoopsLabFULL;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                ticketPrice = 12;
            } else if (day.equals("Weekend")) {
                ticketPrice = 15;
            } else if (day.equals("Holiday")) {
                ticketPrice = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                ticketPrice = 18;
            } else if (day.equals("Weekend")) {
                ticketPrice = 20;
            } else if (day.equals("Holiday")) {
                ticketPrice = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (day.equals("Weekday")) {
                ticketPrice = 12;
            } else if (day.equals("Weekend")) {
                ticketPrice = 15;
            } else if (day.equals("Holiday")) {
                ticketPrice = 10;
            }
        }
        if (ticketPrice > 0) {
            System.out.println(ticketPrice + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
