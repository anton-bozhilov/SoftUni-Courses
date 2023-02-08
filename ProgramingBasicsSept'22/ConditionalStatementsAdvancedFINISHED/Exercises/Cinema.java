package ConditionalStatementsAdvancedFINISHED.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int countR = Integer.parseInt(scanner.nextLine());
        int countC = Integer.parseInt(scanner.nextLine());

        int totalSids = countC * countR;
        double totalSum = 0.0;
        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        switch (type) {
            case "Premiere":
                totalSum = totalSids * 12.00;
                break;
            case "Normal":
                totalSum = totalSids * 7.50;
                break;
            case "Discount":
                totalSum = totalSids * 5.00;
                break;
        }
        System.out.printf("%.2f leva", totalSum);
    }
}
