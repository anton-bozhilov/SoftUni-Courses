package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalsum = 0.0;
        int bonus = 0;
        int age = 18;

        for (int i = 1800; i <= n; i++) {
            if (i % 2 == 0) {
                totalsum = totalsum + 12000;
            } else {
                totalsum = totalsum + 12000 + (age * 50);
            }
            age++;
        }
        if (money >= totalsum) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money - totalsum);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", totalsum - money);
        }
    }
}
