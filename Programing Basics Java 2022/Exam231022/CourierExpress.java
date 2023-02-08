package Exam231022;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weigth = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int kms = Integer.parseInt(scanner.nextLine());

        double totalPriceStandard = 0.0;
        double totalPriceExpress = 0.0;

        switch (input) {
            case "standard":
                if (weigth < 1) {
                    totalPriceStandard = kms * 3.0 / 100;
                } else if (weigth < 10) {
                    totalPriceStandard = kms * 5.0 / 100;
                } else if (weigth < 40) {
                    totalPriceStandard = kms * 10.0 / 100;
                } else if (weigth < 90) {
                    totalPriceStandard = kms * 15.0 / 100;
                } else if (weigth < 150) {
                    totalPriceStandard = kms * 20.0 / 100;
                }
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weigth, totalPriceStandard);
                break;
            case "express":
                if (weigth < 1) {
                    totalPriceExpress = (kms * 3.0 / 100) + ((0.03 * 0.80) * weigth * kms);
                } else if (weigth < 10) {
                    totalPriceExpress = (kms * 5.0 / 100) + ((0.05 * 0.40) * weigth * kms);
                } else if (weigth < 40) {
                    totalPriceExpress = (kms * 10.0 / 100) + ((0.10 * 0.05) * weigth * kms);
                } else if (weigth < 90) {
                    totalPriceExpress = (kms * 15.0 / 100) + ((0.15 * 0.02) * weigth * kms);
                } else if (weigth < 150) {
                    totalPriceExpress = (kms * 20.0 / 100) + ((0.20 * 0.01) * weigth * kms);
                }
                System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weigth, totalPriceExpress);

                break;
        }


    }
}
