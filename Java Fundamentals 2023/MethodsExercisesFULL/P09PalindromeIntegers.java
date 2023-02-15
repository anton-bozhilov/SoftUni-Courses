package MethodsExercisesFULL;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        while (!textInput.equals("END")) {
            if (isEqual(textInput)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            textInput = scanner.nextLine();
        }
    }

    public static boolean isEqual(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);
        }
        if (text.equals(reversedText)) {
            return true;
        } else {
            return false;
        }
    }


}
