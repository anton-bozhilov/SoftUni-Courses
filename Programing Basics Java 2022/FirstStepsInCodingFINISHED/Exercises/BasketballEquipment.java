package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double godishna = Double.parseDouble(scanner.nextLine());

        double kecove = godishna*0.60;
        double ekip = kecove*0.80;
        double topka = ekip*0.25;
        double aksesoari = topka*0.20;

        double suma = godishna+kecove+ekip+topka+aksesoari;
        System.out.println(suma);
    }
}
