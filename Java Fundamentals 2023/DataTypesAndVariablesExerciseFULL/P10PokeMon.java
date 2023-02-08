package DataTypesAndVariablesExerciseFULL;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int startPower = power;
        int counter = 0;

        while (power >= distance) {
            power -= distance;
            counter++;

            if (power == startPower / 2 && factor != 0) {
                power = power / factor;
            }


        }
        System.out.println(power);
        System.out.println(counter);

    }
}
