package TextProcessingExercisesFULL;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        System.out.println(calculation(input[0], input[1]));

    }

    public static int calculation(String string1, String string2) {
        int totalSum = 0;
        if (string1.length() > string2.length()) {
            for (int i = 0; i < string2.length(); i++) {
                totalSum += string1.charAt(i) * string2.charAt(i);
            }
            for (int i = string2.length(); i < string1.length(); i++) {
                totalSum += string1.charAt(i);
            }
        } else {
            for (int i = 0; i < string1.length(); i++) {
                totalSum += string1.charAt(i) * string2.charAt(i);
            }
            for (int i = string1.length(); i < string2.length(); i++) {
                int current = string2.charAt(i);
                totalSum += current;
            }

        }
        return totalSum;
    }
}
