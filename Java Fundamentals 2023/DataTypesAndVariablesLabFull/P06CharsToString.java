package DataTypesAndVariablesLabFull;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            char symbols = scanner.nextLine().charAt(0);
            System.out.print(symbols);
        }
    }
}
