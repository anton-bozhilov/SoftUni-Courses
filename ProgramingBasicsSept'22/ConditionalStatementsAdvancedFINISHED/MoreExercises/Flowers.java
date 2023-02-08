package ConditionalStatementsAdvancedFINISHED.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(scanner.nextLine()); //броят на закупените хризантеми
        int roses = Integer.parseInt(scanner.nextLine()); //броят на закупените rozi
        int laleta = Integer.parseInt(scanner.nextLine()); //броят на закупените laleta
        String season = scanner.nextLine();
        String weekend = scanner.nextLine();

        double price = 0.0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = hrizantemi * 2 + roses * 4.10 + laleta * 2.50;
                break;
            case "Autumn":
            case "Winter":
                price = hrizantemi * 3.75 + roses * 4.50 + laleta * 4.15;
                break;
        }
        if (weekend.equals("Y")) {
            price = price * 1.15;
        }
        if (laleta > 7 && season.equals("Spring")) {
            price = price * 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            price = price * 0.90;
        }
        if ((hrizantemi + roses + laleta) > 20) {
            price = price * 0.80;
        }
        System.out.printf("%.2f", price + 2);


    }
}
