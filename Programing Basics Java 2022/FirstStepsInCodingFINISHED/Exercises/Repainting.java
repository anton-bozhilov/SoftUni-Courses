package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nailon = Double.parseDouble(scanner.nextLine());
        double boya = Double.parseDouble(scanner.nextLine());
        double razreditel = Double.parseDouble(scanner.nextLine());
        double chasove = Double.parseDouble(scanner.nextLine());

        double sumanailon = (nailon + 2) * 1.50;
        double sumaboya = (boya * 1.10) * 14.50;
        double sumarazred = razreditel * 5;
        double torbi = 0.40;
        double obstasumamateriali = sumanailon + sumaboya + sumarazred + torbi;
        double sumazamaistori = (obstasumamateriali * 0.30) * chasove;
        double suma = obstasumamateriali + sumazamaistori;

        System.out.print(suma);


    }
}
