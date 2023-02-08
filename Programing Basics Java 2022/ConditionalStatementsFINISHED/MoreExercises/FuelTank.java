package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gorivo = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        switch (gorivo) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (liters >= 25) {
                    System.out.printf("You have enough %s.", gorivo.toLowerCase());
                } else {
                    System.out.printf("Fill your tank with %s!", gorivo.toLowerCase());
                }
                break;
            default:
                System.out.println("Invalid fuel!");
        }


    }
}
