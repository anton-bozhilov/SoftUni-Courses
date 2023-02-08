package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chas = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutestotal = chas * 60 + minutes + 15;
        int totalchas = (minutestotal / 60) % 24;
        int totalminutes = minutestotal % 60;

        if (totalminutes < 10) {
            System.out.printf("%d:0%d", totalchas, totalminutes);
        } else {
            System.out.printf("%d:%d", totalchas, totalminutes);
        }


    }
}
