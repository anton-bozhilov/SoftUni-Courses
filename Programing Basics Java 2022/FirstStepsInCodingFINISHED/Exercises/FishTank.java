package FirstStepsInCodingFINISHED.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dyljinacm = Integer.parseInt(scanner.nextLine());
        int shirochinacm = Integer.parseInt(scanner.nextLine());
        int visochinacm = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double obemakva = dyljinacm * shirochinacm * visochinacm;
        double obemlitri = obemakva / 1000;
        double zaetopro = procent / 100;
        double nujnilitri = obemlitri * (1 - zaetopro);

        System.out.println(nujnilitri);

    }
}
