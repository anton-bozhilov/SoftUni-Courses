package Exam231022;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFat = Integer.parseInt(scanner.nextLine());
        int percentProt = Integer.parseInt(scanner.nextLine());
        int percentHydr = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double fats = (calories * 1.0 * (percentFat / 100.0)) / 9;
        double prot = (calories * 1.0 * (percentProt / 100.0)) / 4;
        double hydr = (calories * 1.0 * (percentHydr / 100.0)) / 4;

        double totalWeight = fats + prot + hydr;

        double calPerGram = (calories / totalWeight) * (1 - (percentWater / 100.0));

        System.out.printf("%.4f", calPerGram);


    }
}
