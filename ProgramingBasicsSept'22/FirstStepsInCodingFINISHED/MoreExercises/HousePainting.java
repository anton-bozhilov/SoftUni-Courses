package FirstStepsInCodingFINISHED.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //lice na stenite malki
        //lice na stenite golemi
        double licesteni = ((2*(x*y)) + (2*(x*x))) -(1.2*2) - (2*(1.5*1.5));
        double licepokriv = (2*(x*y)) + (2*(0.5*x*h));

        System.out.printf("%.2f", (licesteni/3.40));
        System.out.println();
        System.out.printf("%.2f", (licepokriv/4.30));





    }
}
