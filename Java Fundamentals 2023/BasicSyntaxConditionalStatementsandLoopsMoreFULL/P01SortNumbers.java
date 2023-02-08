package BasicSyntaxConditionalStatementsandLoopsMoreFULL;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        int third = 0;

        if (a >= b && a >= c) {
            first = a;
        } else if (b >= a && b >= c) {
            first = b;
        } else {
            first = c;
        }

        if (a >= b && a <= c) {
            second = a;
        } else if (a <= b && a >= c) {
            second = a;
        } else if ((b >= a && b <= c)) {
            second = b;
        } else if (b <= a && b >= c) {
            second = b;
        } else {
            second = c;
        }

        if (a <= b && a <= c) {
            third = a;
        } else if (b <= a && b <= c) {
            third = b;
        } else {
            third = c;
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
