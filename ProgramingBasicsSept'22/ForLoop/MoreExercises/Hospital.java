package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treated = 0;
        int untreated = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (untreated > treated) {
                    doctors++;
                }
            }
            int patients = Integer.parseInt(scanner.nextLine());
            if (patients >= doctors) {
                treated = treated + doctors;
                untreated = untreated + (patients - doctors);
            } else {
                treated = treated + patients;
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.%n", untreated);
    }
}
