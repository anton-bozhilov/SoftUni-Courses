package FirstStepsInCodingFINISHED.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //паламуд, сафрид и миди
        double priceskumriakg = Double.parseDouble(scanner.nextLine());
        double pricecacakg = Double.parseDouble(scanner.nextLine());
        double kgpalamud = Double.parseDouble(scanner.nextLine());
        double kgsafrid = Double.parseDouble(scanner.nextLine());
        int kgmidi = Integer.parseInt(scanner.nextLine());
        //•	Паламуд – 60% по-скъп от скумрията
        //•	Сафрид – 80% по-скъп от цацата
        //  •	Миди – 7.50 лв. за килограм
        double pricepalamud = 1.60*priceskumriakg*kgpalamud;
        double pricesafrid = 1.8*pricecacakg*kgsafrid;
        double pricemidi = kgmidi*7.50;

        System.out.printf("%.2f",(pricepalamud+pricesafrid+pricemidi));





    }
}
