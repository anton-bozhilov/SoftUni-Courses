package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала
        double budjet = Double.parseDouble(scanner.nextLine());
        int broistatisti = Integer.parseInt(scanner.nextLine());
        double cenaobleklozastatist = Double.parseDouble(scanner.nextLine());
        double decor = budjet * 0.10;
        double cenaobleklo = broistatisti * cenaobleklozastatist;
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        if (broistatisti > 150) {
            cenaobleklo = cenaobleklo * 0.90;
        }
        if ((cenaobleklo + decor) > budjet) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budjet - (cenaobleklo + decor)));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budjet - (cenaobleklo + decor));
        }


    }
}
