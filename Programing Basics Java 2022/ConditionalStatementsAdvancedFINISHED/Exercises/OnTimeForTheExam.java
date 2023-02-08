package ConditionalStatementsAdvancedFINISHED.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrHour = Integer.parseInt(scanner.nextLine());
        int arrMinutes = Integer.parseInt(scanner.nextLine());
        int exam = (examHour * 60) + examMinutes;
        int arr = (arrHour * 60) + arrMinutes;

        if (arr > exam) {
            System.out.println("Late");
        } else if (arr >= (exam - 30)) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }
        if (arr < exam && arr > (exam - 60)) {
            System.out.printf("%d minutes before the start", exam - arr);
        } else if (arr <= (exam - 60)) {
            System.out.printf("%d:%02d hours before the start", (exam - arr) / 60, (exam - arr) % 60);
        } else if (arr > exam && arr <= (exam + 59)) {
            System.out.printf("%d minutes after the start", arr - exam);
        } else if (arr >= (exam + 60)) {
            System.out.printf("%d:%02d hours after the start", (arr - exam) / 60, (arr - exam) % 60);
        }

    }
}
