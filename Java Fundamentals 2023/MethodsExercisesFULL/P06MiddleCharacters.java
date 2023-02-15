package MethodsExercisesFULL;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        returnMiddleString(text);
    }

    public static void returnMiddleString(String text) {
        if (text.length() % 2 == 0) {
            char symbol1 = text.charAt((text.length() - 1) / 2);
            char symbol2 = text.charAt(text.length() / 2);
            System.out.printf("%c%c", symbol1, symbol2);
        } else {
            char symbol = text.charAt(text.length() / 2);
            System.out.println(symbol);
        }
    }
}
