package BasicSyntaxConditionalStatementsandLoopsEXFULL;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password = password + symbol;
        }
        int failed = 0;
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            failed++;
            if (failed < 4) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s blocked!", username);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
