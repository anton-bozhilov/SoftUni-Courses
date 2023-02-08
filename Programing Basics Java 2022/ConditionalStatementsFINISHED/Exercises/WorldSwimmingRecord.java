package ConditionalStatementsFINISHED.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSecs = Double.parseDouble(scanner.nextLine());
        double lengthmeters = Double.parseDouble(scanner.nextLine());
        double secsForMeter = Double.parseDouble(scanner.nextLine());
        double ivanTime = lengthmeters * secsForMeter;
        double suprotivlenieSecs = (Math.floor(lengthmeters / 15)) * 12.5;
        double totalTimeIvan = ivanTime + suprotivlenieSecs;

        if (totalTimeIvan < recordSecs) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeIvan);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimeIvan - recordSecs);
        }


    }
}
