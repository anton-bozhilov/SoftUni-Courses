package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firsttime = Integer.parseInt(scanner.nextLine());
        int secondtime = Integer.parseInt(scanner.nextLine());
        int thirdtime = Integer.parseInt(scanner.nextLine());

        int total = firsttime + secondtime + thirdtime;

        int minutes = total / 60;
        int seconds = total % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }

}
