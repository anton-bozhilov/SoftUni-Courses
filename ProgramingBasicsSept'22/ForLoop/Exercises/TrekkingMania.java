package ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // broqt na grupite

        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;
        int totalPeople = 0;

        for (int i = 1; i <= n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople = totalPeople + people;
            if (people <= 5) {
                group1 = group1 + people;
            } else if (people <= 12) {
                group2 = group2 + people;
            } else if (people <= 25) {
                group3 = group3 + people;
            } else if (people <= 40) {
                group4 = group4 + people;
            } else {
                group5 = group5 + people;

            }
        }
        System.out.printf("%.2f%%%n", group1 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group3 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group4 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group5 * 1.0 / totalPeople * 100);
    }
}
