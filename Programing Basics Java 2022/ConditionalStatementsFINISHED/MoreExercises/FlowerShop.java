package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbiuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        double totalSum = (magnolii * 3.25 + zumbiuli * 4 + rozi * 3.50 + kaktusi * 8) * 0.95;
        if (totalSum >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalSum - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - totalSum));
        }


    }
}
