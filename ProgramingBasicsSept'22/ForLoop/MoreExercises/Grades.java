package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int twoToThree = 0;
        int threeToFour = 0;
        int fourToFive = 0;
        int fivePlus = 0;

        double total = 0.0;
        for (int i = 1; i <= n; i++) {
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade >= 5) {
                fivePlus++;
            } else if (currentGrade >= 4) {
                fourToFive++;
            } else if (currentGrade >= 3) {
                threeToFour++;
            } else {
                twoToThree++;
            }
            total = total + currentGrade;
        }
        System.out.printf("Top students: %.2f%%%n", fivePlus * 1.0 / n * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", fourToFive * 1.0 / n * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", threeToFour * 1.0 / n * 100);
        System.out.printf("Fail: %.2f%%%n", twoToThree * 1.0 / n * 100);
        System.out.printf("Average: %.2f", total / n);
    }
}
