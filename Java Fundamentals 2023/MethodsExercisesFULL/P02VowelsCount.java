package MethodsExercisesFULL;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        countVowels(textInput);
    }

    public static void countVowels(String text) {
        int count = 0;
        for (char symbol : text.toLowerCase().toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'u' || symbol == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
