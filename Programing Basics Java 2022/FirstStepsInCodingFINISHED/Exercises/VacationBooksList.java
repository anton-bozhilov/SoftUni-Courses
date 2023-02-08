package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stranici = Integer.parseInt(scanner.nextLine());
        int stranicizachas = Integer.parseInt(scanner.nextLine());
        int dni = Integer.parseInt(scanner.nextLine());

        int chasanaden = stranici / stranicizachas;
        int rezultat = chasanaden / dni;

        System.out.println(rezultat);
        //kolko chasa na den trqbva da chete

    }
}
