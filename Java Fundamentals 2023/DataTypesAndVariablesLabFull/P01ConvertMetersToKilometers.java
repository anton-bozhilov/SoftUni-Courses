package DataTypesAndVariablesLabFull;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", input / 1000);


    }
}
