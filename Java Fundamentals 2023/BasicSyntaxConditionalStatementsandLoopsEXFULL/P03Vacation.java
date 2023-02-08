package BasicSyntaxConditionalStatementsandLoopsEXFULL;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0.0;
        double ticket = 0.0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        sum = group * 8.45;
                        break;
                    case "Saturday":
                        sum = group * 9.80;
                        break;
                    case "Sunday":
                        sum = group * 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        sum = group * 10.90;
                        ticket = 10.90;
                        break;
                    case "Saturday":
                        sum = group * 15.60;
                        ticket = 15.60;
                        break;
                    case "Sunday":
                        sum = group * 16.0;
                        ticket = 16.00;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        sum = group * 15.0;
                        break;
                    case "Saturday":
                        sum = group * 20.0;
                        break;
                    case "Sunday":
                        sum = group * 22.50;
                        break;
                }
                break;
        }
        if (group >= 30 && type.equals("Students")) {
            sum = sum * 0.85;
        } else if (group >= 100 && type.equals("Business")) {
            sum = (group - 10) * ticket;
        } else if (group >= 10 && group <= 20 && type.equals("Regular")) {
            sum = sum * 0.95;
        }


        System.out.printf("Total price: %.2f", sum);
    }
}
