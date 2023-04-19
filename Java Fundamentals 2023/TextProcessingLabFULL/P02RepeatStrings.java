package TextProcessingLabFULL;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            String textToPrint = "";
            for (int j = 0; j < word.length(); j++) {
                textToPrint += word;
            }
            System.out.print(textToPrint);
        }

    }
}
