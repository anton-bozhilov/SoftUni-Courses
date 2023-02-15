package MethodsExercisesFULL;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        boolean isValid = true;
        //Password must be between 6 and 10 characters
        if (validateLength(textInput) == false) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        //Password must consist only of letters and digits
        if (checkForLetterAndDigit(textInput) == false) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }
        //Password must have at least 2 digits
        if (checkForUpperDigit(textInput) == false) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        if (isValid) {
            System.out.println("Password is valid");
        }

    }

    public static boolean validateLength(String text) {
        // if (text.length()<6 || text.length()>10) {
        //     System.out.println("Password must be between 6 and 10 characters");
        // }
        return text.length() >= 6 && text.length() <= 10;
    }

    public static boolean checkForLetterAndDigit(String text) {
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }


    public static boolean checkForUpperDigit(String text) {
        int digit = 0;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digit++;
            }
        }
        return digit >= 2;
    }


}
