package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + current;
        }
        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + current;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
