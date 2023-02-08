package ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournirs = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        //W" 2000 , "F" 1200 или "SF" 720
        int wins = 0;
        int totalPoints = points;

        for (int i = 1; i <= tournirs; i++) {
            String level = scanner.nextLine();
            switch (level) {
                case "W":
                    wins++;
                    totalPoints = totalPoints + 2000;
                    break;
                case "F":
                    totalPoints = totalPoints + 1200;
                    break;
                case "SF":
                    totalPoints = totalPoints + 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((totalPoints - points) * 1.0 / tournirs));
        System.out.printf("%.2f%%", wins * 1.0 / tournirs * 100);

    }
}
