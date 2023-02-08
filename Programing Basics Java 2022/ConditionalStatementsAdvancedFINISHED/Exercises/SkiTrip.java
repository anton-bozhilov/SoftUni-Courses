package ConditionalStatementsAdvancedFINISHED.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();

        double price = 0.0;

        switch (type) {
            case "room for one person":
                price = (days - 1) * 18;
                break;
            case "apartment":
                if (days < 10) {
                    price = ((days - 1) * 25) * 0.70;
                } else if (days > 15) {
                    price = ((days - 1) * 25) * 0.50;
                } else {
                    price = ((days - 1) * 25) * 0.65;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = ((days - 1) * 35) * 0.90;
                } else if (days > 15) {
                    price = ((days - 1) * 35) * 0.80;
                } else {
                    price = ((days - 1) * 35) * 0.85;
                }
                break;
        }
        switch (grade) {
            case "positive":
                price = price * 1.25;
                break;
            case "negative":
                price = price * 0.90;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
