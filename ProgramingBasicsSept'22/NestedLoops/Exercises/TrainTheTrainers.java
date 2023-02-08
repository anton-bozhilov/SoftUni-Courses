package NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String presentation = scanner.nextLine();

        int count = 0;
        double total = 0;
        while (!presentation.equals("Finish")) {
            double totalGrade = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                totalGrade += currentGrade;
                total += currentGrade;
                count++;
            }
            System.out.printf("%s - %.2f.%n", presentation, totalGrade / n);
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", total / count);
    }
}
