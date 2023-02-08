package DataTypesAndVariablesExerciseFULL;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        double snowballValue = 0;
        for (int i = 1; i <= balls; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow(snow / time, quality);
            if (value >= snowballValue) {
                snowballSnow = snow;
                snowballTime = time;
                snowballQuality = quality;
                snowballValue = value;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);

    }
}
