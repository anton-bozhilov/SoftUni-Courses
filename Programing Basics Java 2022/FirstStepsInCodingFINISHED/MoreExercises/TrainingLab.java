package FirstStepsInCodingFINISHED.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dyljina = Double.parseDouble(scanner.nextLine());
        double shirochina = Double.parseDouble(scanner.nextLine());

        double vazmojnipodyljina = Math.floor((dyljina * 100) / 120);
        double vazmojniposhirochina = Math.floor(((shirochina * 100) - 100) / 70);

        double total = (vazmojniposhirochina * vazmojnipodyljina) - 3;

        System.out.printf("%.0f", total);


    }

}
