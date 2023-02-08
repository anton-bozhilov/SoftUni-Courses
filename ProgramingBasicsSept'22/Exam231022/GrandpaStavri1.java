package Exam231022;

import java.util.Scanner;

public class GrandpaStavri1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0.0;
        double totalDegrees = 0.0;

        for (int i = 1; i <= n; i++) {
            double liters = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            totalLiters += liters;
            totalDegrees = totalDegrees + liters * degrees;
        }
        totalDegrees = totalDegrees / totalLiters;
        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", totalDegrees);
        if (totalDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (totalDegrees <= 42 ) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
