package Exam231022;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double wonPerDaySales = Double.parseDouble(scanner.nextLine());
        double pays = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double savedMoney = (moneyPerDay + wonPerDaySales) * 5 - pays;
        if (savedMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", savedMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - savedMoney);
        }


    }
}
