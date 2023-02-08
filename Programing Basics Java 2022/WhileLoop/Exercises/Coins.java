package WhileLoop.Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Math.floor(Double.parseDouble(scanner.nextLine()) * 100);
        int count = 0;

        while (num > 0) {
            count++;
            if (num >= 200) {
                num = num - 200;
            } else if (num >= 100) {
                num = num - 100;
            } else if (num >= 50) {
                num = num - 50;
            } else if (num >= 20) {
                num = num - 20;
            } else if (num >= 10) {
                num = num - 10;
            } else if (num >= 5) {
                num = num - 5;
            } else if (num >= 2) {
                num = num - 2;
            } else if (num == 1) {
                num = num - 1;
            }
        }
        System.out.printf("%d", count);
    }
}
