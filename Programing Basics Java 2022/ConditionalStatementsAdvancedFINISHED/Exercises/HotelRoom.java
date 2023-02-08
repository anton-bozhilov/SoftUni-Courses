package ConditionalStatementsAdvancedFINISHED.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double totalSumStudio = 0.0;
        double totalSumApartment = 0.0;
        //•	На първия ред е месецът – May, June, July, August, September или October
        switch (month) {
            case "May":
            case "October":
                totalSumApartment = nights * 65.0;
                totalSumStudio = nights * 50.0;
                if (nights > 14) {
                    totalSumApartment = totalSumApartment * 0.90;
                    totalSumStudio = totalSumStudio * 0.70;
                } else if (nights > 7) {
                    totalSumStudio = totalSumStudio * 0.95;
                }
                break;
            case "June":
            case "September":
                totalSumApartment = nights * 68.70;
                totalSumStudio = nights * 75.20;
                if (nights > 14) {
                    totalSumApartment = totalSumApartment * 0.90;
                    totalSumStudio = totalSumStudio * 0.80;
                }
                break;
            case "July":
            case "August":
                totalSumApartment = nights * 77;
                totalSumStudio = nights * 76;
                if (nights > 14) {
                    totalSumApartment = totalSumApartment * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.", totalSumApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", totalSumStudio);
    }
}
