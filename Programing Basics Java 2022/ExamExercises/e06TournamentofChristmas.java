package ExamExercises;

import java.util.Scanner;

public class e06TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int loses = 0;
        double totalSavedMoney = 0;

        for (int i = 1; i <= n; i++) {
            double savedMoney = 0;
            int dayWins = 0;
            int dayLoses = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {

                String result = scanner.nextLine();

                if (result.equals("win")) {
                    dayWins++;
                    wins++;
                    savedMoney += 20;
                } else {
                    dayLoses++;
                    loses++;
                }
                input = scanner.nextLine();
            }
            if (dayWins > dayLoses) {
                totalSavedMoney = totalSavedMoney + savedMoney * 1.10;
            } else {
                totalSavedMoney = totalSavedMoney + savedMoney;
            }
        }
        if (wins > loses) {
            totalSavedMoney = totalSavedMoney * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalSavedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalSavedMoney);
        }
    }
}
