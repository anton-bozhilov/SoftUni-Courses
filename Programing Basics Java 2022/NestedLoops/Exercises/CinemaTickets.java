package NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalTickets = 0;
        int kids = 0;
        int standart = 0;
        int student = 0;

        while (!input.equals("Finish")) {
            String movie = input;
            int capacity = Integer.parseInt(scanner.nextLine());
            int count = 0;
            for (int i = 1; i <= capacity; i++) {
                input = scanner.nextLine();
                switch (input) {
                    case "kid":
                        kids++;
                        break;
                    case "standard":
                        standart++;
                        break;
                    case "student":
                        student++;
                        break;
                }
                if (input.equals("End")) {
                    break;
                }
                totalTickets++;
                count++;
            }
            System.out.printf("%s - %.2f%% full.%n", movie, count * 100.00 / capacity);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", standart * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.%n", kids * 100.0 / totalTickets);
    }
}

