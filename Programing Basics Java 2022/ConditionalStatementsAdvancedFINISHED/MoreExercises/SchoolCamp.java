package ConditionalStatementsAdvancedFINISHED.MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();//Сезонът – текст - “Winter”, “Spring” или “Summer”;
        String type = scanner.nextLine();//Видът на групата – текст - “boys”, “girls” или “mixed”;
        int countSchoolers = Integer.parseInt(scanner.nextLine());//Брой на учениците
        int countNights = Integer.parseInt(scanner.nextLine());//Брой на нощувките

        double price = 0.0;
        String sport = "";

        switch (season) {
            case "Winter":
                switch (type) {
                    case "boys":
                        price = countSchoolers * countNights * 9.60;
                        sport = "Judo";
                        break;
                    case "girls":
                        price = countSchoolers * countNights * 9.60;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        price = countSchoolers * countNights * 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (type) {
                    case "boys":
                        price = countSchoolers * countNights * 7.20;
                        sport = "Tennis";
                        break;
                    case "girls":
                        price = countSchoolers * countNights * 7.20;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        price = countSchoolers * countNights * 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (type) {
                    case "boys":
                        price = countSchoolers * countNights * 15;
                        sport = "Football";
                        break;
                    case "girls":
                        price = countSchoolers * countNights * 15;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        price = countSchoolers * countNights * 20;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        if (countSchoolers >= 50) {
            price = price * 0.50;
        } else if (countSchoolers >= 20) {
            price = price * 0.85;
        } else if (countSchoolers >= 10) {
            price = price * 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
