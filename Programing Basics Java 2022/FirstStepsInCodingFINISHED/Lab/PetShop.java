package FirstStepsInCodingFINISHED.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog = Integer.parseInt(scanner.nextLine());
        Double cat = Double.parseDouble(scanner.nextLine());
        Double sum = dog * 2.5 + cat * 4;


        System.out.println(sum + " lv");


    }
}
