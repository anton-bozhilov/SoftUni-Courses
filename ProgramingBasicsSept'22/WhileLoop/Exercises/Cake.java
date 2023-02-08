package WhileLoop.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int pieces = length * width;

        while (pieces >= 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int current = Integer.parseInt(input);
            pieces = pieces - current;

        }
        if (pieces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}
