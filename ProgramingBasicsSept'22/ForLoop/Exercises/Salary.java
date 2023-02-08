package ForLoop.Exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //брой отворени табове
        double salary = Double.parseDouble(scanner.nextLine());

        double fine = 0.0;
        for (int i = 1; i <= n; i++) {
            String tab = scanner.nextLine();
            switch (tab) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }
}
