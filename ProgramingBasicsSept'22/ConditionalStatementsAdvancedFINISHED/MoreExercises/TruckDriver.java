package ConditionalStatementsAdvancedFINISHED.MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonth = Double.parseDouble(scanner.nextLine());

        double salary = 0.0;

        if (kmMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = kmMonth * 0.75;
                    break;
                case "Summer":
                    salary = kmMonth * 0.90;
                    break;
                case "Winter":
                    salary = kmMonth * 1.05;
                    break;
            }
        } else if (kmMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = kmMonth * 0.95;
                    break;
                case "Summer":
                    salary = kmMonth * 1.10;
                    break;
                case "Winter":
                    salary = kmMonth * 1.25;
                    break;
            }
        } else if (kmMonth <= 20000) {
            salary = kmMonth * 1.45;
        }
        salary = (salary * 4) * 0.90;
        System.out.printf("%.2f", salary);
    }
}
