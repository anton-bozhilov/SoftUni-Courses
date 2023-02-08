package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int total = 0;

        while (num > total) {
            int current = Integer.parseInt(scanner.nextLine());
            total = total + current;

        }
        System.out.println(total);

    }
}
