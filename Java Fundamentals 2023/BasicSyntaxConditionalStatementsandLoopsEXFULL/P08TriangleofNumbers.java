package BasicSyntaxConditionalStatementsandLoopsEXFULL;

import java.util.Scanner;

public class P08TriangleofNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i);
                count++;
                if (count == i) {
                    System.out.println();
                }
            }


        }


    }
}
