package WhileLoop.Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 10000;

        int totalSteps = 0;
        String input = scanner.nextLine();

        while (totalSteps < target) {
            if (input.equals("Going home")) {
                int plus = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + plus;
                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps = totalSteps + steps;

            if (totalSteps >= target) {
                break;
            }
            input = scanner.nextLine();

        }
        if (totalSteps >= target) {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", totalSteps - target);
        } else {
            System.out.printf("%d more steps to reach goal.", target - totalSteps);
        }


    }
}
