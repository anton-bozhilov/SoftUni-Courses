package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double broipileshki = Double.parseDouble(scanner.nextLine());
        double broiribni = Double.parseDouble(scanner.nextLine());
        double broivege = Double.parseDouble(scanner.nextLine());

        //pile-10.35  ribi - 12.40  vege- 8.15
        double cenapile = broipileshki * 10.35;
        double cenaribi = broiribni * 12.40;
        double cenavege = broivege * 8.15;
        double obshta = cenapile + cenaribi + cenavege;
        double cenadesert = obshta * 0.20;
        double dostavka = 2.50;
        double rezult = obshta + cenadesert + dostavka;

        System.out.println(rezult);


    }
}
