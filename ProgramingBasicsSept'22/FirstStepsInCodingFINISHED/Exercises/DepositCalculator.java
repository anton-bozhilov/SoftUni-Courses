package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depozsuma = Double.parseDouble(scanner.nextLine());
        double srok = Double.parseDouble(scanner.nextLine());
        double glp = Double.parseDouble(scanner.nextLine());

        double lihva = depozsuma * (glp/100);
        double mesechna = lihva / 12;
        double suma = depozsuma + srok*mesechna;



        System.out.println(suma);
    }
}
