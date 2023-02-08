package BasicSyntaxConditionalStatementsandLoopsLabFULL;

import java.util.Scanner;

public class P13RefactorSumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int n2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(n2);

            sum = sum + n2;
            n2 = n2 + 2;
        }
        System.out.printf("Sum: %d%n", sum);


    }
}
