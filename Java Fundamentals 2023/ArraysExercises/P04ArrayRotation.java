package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String firstNum = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[array.length - 1] = firstNum;
        }
        System.out.println(String.join(" ", array));

    }
}
