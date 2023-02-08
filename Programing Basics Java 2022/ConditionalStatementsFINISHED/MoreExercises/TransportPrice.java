package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kms = Integer.parseInt(scanner.nextLine());
        String metod = scanner.nextLine();
        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        double taxiday = kms * 0.79 + 0.70;
        double taxinight = kms * 0.90 + 0.70;
        double bus = kms * 0.09;
        double train = kms * 0.06;

        if (kms < 20) {
            if (metod.equals("day")) {
                System.out.printf("%.2f", taxiday);
            } else {
                System.out.printf("%.2f", taxinight);
            }
        } else if (kms >= 100) {
            System.out.printf("%.2f", train);
        } else {
            System.out.printf("%.2f", bus);
        }

    }
}
