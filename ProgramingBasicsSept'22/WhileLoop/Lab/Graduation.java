package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double total = 0.0;
        int years = 1;
        int badGrade = 0;

        while (years <= 12) {
            double current = Double.parseDouble(scanner.nextLine());
            if (current < 4) {
                badGrade++;
                if (badGrade > 1) {
                    break;
                }
                continue;
            }
            total = total + current;
            years++;
        }
        if (badGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", name, years);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, total / 12);
        }
    }
}
