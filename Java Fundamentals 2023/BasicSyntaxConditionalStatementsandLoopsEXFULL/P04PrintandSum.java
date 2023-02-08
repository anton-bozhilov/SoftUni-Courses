package BasicSyntaxConditionalStatementsandLoopsEXFULL;

import java.util.Scanner;

public class P04PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            sum += i;
            System.out.print(i + " ");

        }
        System.out.printf("%nSum: %d", sum);
    }

}
