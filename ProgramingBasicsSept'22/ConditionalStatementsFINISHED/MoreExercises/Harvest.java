package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalm2 = Integer.parseInt(scanner.nextLine()); // кв.м е лозето
        double kgGrozdeza1m2 = Double.parseDouble(scanner.nextLine());//Y грозде за един кв.м
        int neededLitersWine = Integer.parseInt(scanner.nextLine()); //нужни литри вино
        int workers = Integer.parseInt(scanner.nextLine());  // broi rabotnici

        double ploshtForWinem2 = totalm2 * 0.40;
        double litersWine = (ploshtForWinem2 * kgGrozdeza1m2) / 2.50;
        if (litersWine < neededLitersWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLitersWine - litersWine));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(litersWine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", litersWine - neededLitersWine, Math.ceil((litersWine - neededLitersWine) / workers));
        }

    }
}
