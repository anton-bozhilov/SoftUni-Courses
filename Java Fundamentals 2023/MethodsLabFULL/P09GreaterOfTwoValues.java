package MethodsLabFULL;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();

        switch (typeInput) {
            case "int":
                int firstNumInput = Integer.parseInt(scanner.nextLine());
                int secondNumInput = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumInput, secondNumInput));
                break;
            case "char":
                char firstSymbolInput = scanner.nextLine().charAt(0);
                char secondSymbolInput = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbolInput, secondSymbolInput));
                break;
            case "string":
                String firstTextInput = scanner.nextLine();
                String secondTextInput = scanner.nextLine();
                System.out.println(getMax(firstTextInput, secondTextInput));
                break;
        }

    }
    public static int getMax (int first, int second) {
        if (first > second) {
            return first;
        } else {
            return  second;
        }
    }

    public static char getMax (char first, char second) {
        if (first > second) {
            return first;
        } else {
            return  second;
        }
    }

    public static String getMax (String first, String second) {
        //if ( first.compareTo(second) > 0) {
        if (first.length() > second.length()) {
            return first;
        } else {
            return  second;
        }
    }



}
