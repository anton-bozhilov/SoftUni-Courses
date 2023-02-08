package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int ostavenaHrana = Integer.parseInt(scanner.nextLine());
        double kgDogPerDay = Double.parseDouble(scanner.nextLine());
        double kgCatgPerDay = Double.parseDouble(scanner.nextLine());
        double kgTurtlePerDay = (Double.parseDouble(scanner.nextLine()) / 1000);

        double neededForAll = (kgCatgPerDay + kgTurtlePerDay + kgDogPerDay) * days;
        if (ostavenaHrana >= neededForAll) {
            System.out.printf("%.0f kilos of food left.", Math.floor(ostavenaHrana - neededForAll));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededForAll - ostavenaHrana));
        }


    }
}
