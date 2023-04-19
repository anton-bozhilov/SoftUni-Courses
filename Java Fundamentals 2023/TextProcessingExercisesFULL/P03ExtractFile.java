package TextProcessingExercisesFULL;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");
        String[] needed = input[input.length - 1].split("\\.");

        System.out.println("File name: " + needed[0]);
        System.out.println("File extension: " + needed[1]);

    }
}
