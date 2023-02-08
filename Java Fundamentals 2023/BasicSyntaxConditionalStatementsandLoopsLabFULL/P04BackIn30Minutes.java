package BasicSyntaxConditionalStatementsandLoopsLabFULL;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());
        int totalMin = inputMinutes + inputHours * 60 + 30;

        int hours = totalMin / 60;
        int minutes = totalMin % 60;
        if (hours > 23 ) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours , minutes);


    }


}
