package ConditionalStatementsAdvancedFINISHED.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double tax = 0.0;

        switch (trace) {
            case "trail":
                tax = (juniors * 5.50) + (seniors * 7);
                break;
            case "cross-country":
                tax = (juniors * 8) + (seniors * 9.50);
                break;
            case "downhill":
                tax = (juniors * 12.25) + (seniors * 13.75);
                break;
            case "road":
                tax = (juniors * 20) + (seniors * 21.5);
                break;
        }
        if (trace.equals("cross-country") && (juniors + seniors) >= 50) {
            tax = tax * 0.75;
        }
        tax = tax * 0.95;
        System.out.printf("%.2f", tax);

    }
}
