package WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.println("Welcome " + username + "!");
                break;
            }
        }
    }
}
