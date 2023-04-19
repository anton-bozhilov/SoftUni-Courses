package TextProcessingExercisesFULL;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int strength = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol == '>') {
                strength += Integer.parseInt(String.valueOf(text.charAt(i + 1)));

            } else if (symbol != '>' && strength > 0) {
                text.deleteCharAt(i);
                strength--;
                i--;

            }


        }
        System.out.println(text);


    }
}
