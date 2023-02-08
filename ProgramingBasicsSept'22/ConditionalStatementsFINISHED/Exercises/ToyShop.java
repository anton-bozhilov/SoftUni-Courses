package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        //6.	Брой камиончета - цяло число в интервала [0 …
        double cenaekskurzia = Double.parseDouble(scanner.nextLine());
        int broipyzeli = Integer.parseInt(scanner.nextLine());
        int broikukli = Integer.parseInt(scanner.nextLine());
        int broimecheta = Integer.parseInt(scanner.nextLine());
        int broiminioni = Integer.parseInt(scanner.nextLine());
        int broikamioncheta = Integer.parseInt(scanner.nextLine());
        int broitoys = broipyzeli + broikukli + broimecheta + broiminioni + broikamioncheta;
        //•	Пъзел - 2.60 лв.Gовореща кукла - 3 лв.Плюшено мече - 4.10 лв.•Mиньон - 8.20 лв.•	Камионче - 2 лв.
        double cenapyzel = broipyzeli * 2.60;
        double cenakukli = broikukli * 3;
        double cenamecheta = broimecheta * 4.10;
        double cenaminioni = broiminioni * 8.20;
        double cenakamioncheta = broikamioncheta * 2;
        double cenatoys = cenapyzel + cenakukli + cenamecheta + cenaminioni + cenakamioncheta;

        if (broitoys >= 50) {
            cenatoys = cenatoys * 0.75 * 0.90;
        } else {
            cenatoys = cenatoys * 0.90;
        }
        if (cenatoys >= cenaekskurzia) {
            System.out.printf("Yes! %.2f lv left.", cenatoys - cenaekskurzia);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", cenaekskurzia - cenatoys);
          }


    }
}
