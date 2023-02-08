package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double electricity = 0.0;
        double water = 0.0;
        double internet = 0.0;
        double other = 0.0;
        double average = 0.0;

        for (int i = 1; i <= n; i++) {
            double current = Double.parseDouble(scanner.nextLine());

            electricity = electricity + current;
            water = water + 20;
            internet = internet + 15;
            other = other + (current + 20 + 15) * 1.20;
        }
        average = (electricity + water + internet + other) / n;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", average);
    }
}
