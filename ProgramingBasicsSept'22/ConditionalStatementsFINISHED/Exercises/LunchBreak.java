package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();
        int epizodTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime * 0.125;  // vreme za obqd
        double breakFreeTime = breakTime * 0.25; // vreme za otdih
        double freeTime = breakTime - (lunchTime + breakFreeTime); //ostavashto svobodno vreme
        //You have enough time to watch {име на сериал} and left with {останало време} minutes free time.
        if (freeTime >= epizodTime) {
            System.out.printf("You have enough time" +
                    " to watch %s and left with %.0f minutes free time.", nameMovie, Math.ceil(freeTime - epizodTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, " +
                    "you need %.0f more minutes.", nameMovie, Math.ceil(epizodTime - freeTime));
        }


    }
}
