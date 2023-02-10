package MethodsLabFULL;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int numInput = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatText(textInput, numInput));
    }

    public static String repeatText(String text, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result = result + text;
        }
        return result;
    }
}
