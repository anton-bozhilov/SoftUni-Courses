package TextProcessingExercisesFULL;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String word : input) {
            boolean isValid = false;
            if (word.length() >= 3 && word.length() <= 16) {
                for (int i = 0; i < word.length(); i++) {
                    char symbol = word.charAt(i);
                    if (Character.isLetterOrDigit(symbol) || symbol == 45 || symbol == 95) {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                System.out.println(word);
            }
        }


    }
}
