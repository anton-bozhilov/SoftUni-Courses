package FirstStepsInCodingFINISHED.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricevegkg = Double.parseDouble(scanner.nextLine());
        double pricefrutskg = Double.parseDouble(scanner.nextLine());
        double kgsveg = Double.parseDouble(scanner.nextLine());
        double kgfruts = Double.parseDouble(scanner.nextLine());

        double totalveg = pricevegkg*kgsveg;
        double totalfruts = pricefrutskg*kgfruts;
        double totallv = totalveg + totalfruts;
        double totaleu = totallv/1.94;
        System.out.printf("%.2f",totaleu);

    }
}
