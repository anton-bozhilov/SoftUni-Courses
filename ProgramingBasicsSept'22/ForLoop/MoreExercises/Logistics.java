package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalTons = 0.0;
        int bus = 0;
        int truck = 0;
        int train = 0;
        double priceBus = 0.0;
        double priceTruck = 0.0;
        double priceTrain = 0.0;

        for (int i = 1; i <= n; i++) {
            double current = Double.parseDouble(scanner.nextLine());

            if (current <= 3) {
                bus += current;
                priceBus = priceBus + (current * 200);
            } else if (current <= 11) {
                truck += current;
                priceTruck = priceTruck + (current * 175);
            } else {
                train += current;
                priceTrain = priceTrain + (current * 120);
            }
            totalTons = totalTons + current;

        }
        System.out.printf("%.2f%n", (priceBus + priceTrain + priceTruck) / totalTons);
        System.out.printf("%.2f%%%n", ((priceBus / 200) / totalTons * 100));
        System.out.printf("%.2f%%%n", ((priceTruck / 175) / totalTons * 100));
        System.out.printf("%.2f%%", ((priceTrain / 120) / totalTons * 100));


    }
}
