package BasicSyntaxConditionalStatementsandLoopsEXFULL;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadsets = count / 2;
        int brokenMouses = count / 3;
        int brokenKeyboards = count / 6;
        int brokenDisplays = count / 12;

        double totalSum = (brokenHeadsets * headsetPrice) + (brokenMouses * mousePrice) +
                (brokenKeyboards * keyboardPrice) + (brokenDisplays * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
