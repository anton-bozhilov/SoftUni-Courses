package BasicSyntaxConditionalStatementsandLoopsLabFULL;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = n2; i <= 10; i++) {
            sum = n * i;
            System.out.printf("%d X %d = %d%n", n, i, sum);
        }
        if (n2 > 10) {
            sum = n * n2;
            System.out.printf("%d X %d = %d%n", n, n2, sum);
        }
    }
}
