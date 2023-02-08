package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int ot0do9 = 0;
        int ot10do19 = 0;
        int ot20do29 = 0;
        int ot30do39 = 0;
        int ot40do50 = 0;
        int invalid = 0;
        double result = 0;
        //•	От 0 до 9  20 % от числото
        //•	От 10 до 19  30 % от числото
        //•	От 20 до 29  40 % от числото
        //•	От 30 до 39  50 точки
        //•	От 40 до 50  100 точки
        //•	Невалидно число  резултата се дели на 2
        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (current >= 0 && current <= 9) {
                result = result + (current * 0.20);
                ot0do9++;
            } else if (current >= 10 && current <= 19) {
                result = result + (current * 0.30);
                ot10do19++;
            } else if (current >= 20 && current <= 29) {
                result = result + (current * 0.40);
                ot20do29++;
            } else if (current >= 30 && current <= 39) {
                result = result + 50;
                ot30do39++;
            } else if (current >= 40 && current <= 50) {
                result = result + 100;
                ot40do50++;
            } else {
                result = result / 2;
                invalid++;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", ot0do9 * 1.0 / n * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", ot10do19 * 1.0 / n * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", ot20do29 * 1.0 / n * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", ot30do39 * 1.0 / n * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", ot40do50 * 1.0 / n * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalid * 1.0 / n * 100);

    }
}
