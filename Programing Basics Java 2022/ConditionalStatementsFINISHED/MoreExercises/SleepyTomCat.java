package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFreeDays = Integer.parseInt(scanner.nextLine());
        int normYear = 30000;
        int minutesWhenWork = (365-countFreeDays)*63;
        int minutesWhenBreak = countFreeDays*127;
        int totalPlayTime = minutesWhenBreak + minutesWhenWork;

        if (totalPlayTime>normYear) {  //“{H} hours and {M} minutes more for play”
            int razklika = totalPlayTime-normYear;
            int chasove = razklika / 60;
            int minuti = razklika % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",chasove, minuti);
        } else { //“{H} hours and {M} minutes less for play”
            int razlika = normYear- totalPlayTime;
            int chasove = razlika /60;
            int minuti = razlika %60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", chasove, minuti);
        }








    }
}
