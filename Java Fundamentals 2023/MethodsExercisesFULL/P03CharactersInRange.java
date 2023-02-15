package MethodsExercisesFULL;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        char symbol1Input = text1.charAt(0);
        char symbol2Input = text2.charAt(0);

        allCharactersBetween(symbol1Input, symbol2Input);
    }

    public static void allCharactersBetween(int symbol1, int symbol2) {
        if (symbol1 < symbol2) {
            for (int i = symbol1 + 1; i < symbol2; i++) {
                System.out.printf("%c ", (char) i);
            }
        } else {
            for (int i = symbol2 + 1; i < symbol1; i++) {
                System.out.printf("%c ", (char) i);
            }
        }
    }
}
