package ArraysLabFULL;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] array = input.split(" ");

        for (int i = 0; i < array.length / 2; i++) {
            String current = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = current;
        }
        System.out.println(String.join(" ", array));


    }
}
