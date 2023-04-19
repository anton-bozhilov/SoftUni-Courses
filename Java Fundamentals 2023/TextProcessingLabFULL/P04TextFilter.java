package TextProcessingLabFULL;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banned) {
            String asterisks = "";
            for (int i = 0; i < word.length(); i++) {
                asterisks += "*";
            }
            if (text.contains(word)) {
                text = text.replace(word, asterisks);
            }

        }
        System.out.println(text);


    }
}
