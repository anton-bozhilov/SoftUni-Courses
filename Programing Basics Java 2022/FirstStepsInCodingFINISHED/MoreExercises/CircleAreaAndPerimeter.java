package FirstStepsInCodingFINISHED.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double lice = Math.PI * (r * r);
        double parameter = 2 * Math.PI * r;

        System.out.printf("%.2f", lice);
        System.out.println();
        System.out.printf("%.2f", parameter);


    }
}
