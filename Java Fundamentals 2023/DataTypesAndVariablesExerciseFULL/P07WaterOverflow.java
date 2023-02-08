package DataTypesAndVariablesExerciseFULL;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int volume = 255;
        int volumeFilled = 0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            if (volume - current >= 0) {
                volumeFilled += current;
                volume -= current;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(volumeFilled);
    }
}
