package FirstStepsInCodingFINISHED.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double kvm = Double.parseDouble(scanner.nextLine());

        Double cena = kvm * 7.61;
        Double discount = 0.18 * cena;
        Double finalprice = cena - discount;

        System.out.println("The final price is: " + finalprice +" lv.");
        System.out.println("The discount is: " + discount + " lv.");


    }
}
