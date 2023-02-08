package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPoorGrades = Integer.parseInt(scanner.nextLine());

        int numberProblems = 0;
        int countFails = 0;
        int totalGrade = 0;
        String nameProblem = "";
        String name = scanner.nextLine();

        while (!name.equals("Enough") && countFails < countPoorGrades) {

            int grade = Integer.parseInt(scanner.nextLine());
            numberProblems++;
            totalGrade = totalGrade + grade;
            if (grade <= 4) {
                countFails++;
            }
            if (countFails == countPoorGrades) {
                break;
            }
            nameProblem = name;
            name = scanner.nextLine();
        }
        if (countFails == countPoorGrades) {
            System.out.printf("You need a break, %d poor grades.", countFails);
        } else {
            System.out.printf("Average score: %.2f%n", totalGrade * 1.0 / numberProblems);
            System.out.printf("Number of problems: %d%n", numberProblems);
            System.out.printf("Last problem: %s", nameProblem);
        }
    }
}
