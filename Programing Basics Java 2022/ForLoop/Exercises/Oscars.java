package ForLoop.Exercises;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Formattable;
import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String currentActor = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());
            int length = currentActor.length();

            points = points + (currentPoints * length) / 2;

            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
                break;
            }
        }
        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - points);
        }


    }
}
