package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double broipaketihimikali = Double.parseDouble(scanner.nextLine());
        double broipaketimarkeri = Double.parseDouble(scanner.nextLine());
        double litripreparat = Double.parseDouble(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double cenahimikali = broipaketihimikali * 5.80;
        double cenamarkeri = broipaketimarkeri * 7.20;
        double cenapreparat = litripreparat * 1.2;
        double cenaobshto = cenahimikali + cenamarkeri + cenapreparat;
        double cena = cenaobshto - (cenaobshto * (procent / 100));

        System.out.println(cena);


    }
}
