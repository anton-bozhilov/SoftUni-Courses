package WhileLoop.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int volume = a * b * c;

        String input = scanner.nextLine();

        while (true) {
            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", volume);
                break;
            }
            int current = Integer.parseInt(input);
            volume = volume - current;
            if (volume < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }
            input = scanner.nextLine();
        }


    }
}
