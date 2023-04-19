package TextProcessingExercisesFULL;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String word : inputArr) {

            char first = word.charAt(0);
            char second = word.charAt(word.length() - 1);

            double num = Double.parseDouble(word.substring(1, word.length() - 1));

            if (first >= 65 && first <= 90) {
                double index = first - 64;
                num = num * 1.0 / index;
            } else if (first >= 97 && first <= 122) {
                double index = first - 96;
                num = num * index;
            }
            if (second >= 65 && second <= 90) {
                double index = second - 64;
                num = num - index;
            } else if (second >= 97 && second <= 122) {
                double index = second - 96;
                num = num + index;
            }
            totalSum += num;

        }
        System.out.printf("%.2f", totalSum);
    }
}
