package TextProcessingExercisesFULL;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] textArr = input.toCharArray();
        StringBuilder newText = new StringBuilder();

        for (char symbol : textArr) {
            char newCharDigit = (char) (symbol + 3);
            newText.append(newCharDigit);
        }
        System.out.println(newText);

    }
}
