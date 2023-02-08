package Exam231022;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String name = "";
        int maxGoals = 0;

        while (!input.equals("END")) {
            int currentGoals = Integer.parseInt(scanner.nextLine());
            if (currentGoals > maxGoals) {
                maxGoals = currentGoals;
                name = input;
            }
            if (currentGoals >= 10) {
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", name);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
