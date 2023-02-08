package BasicSyntaxConditionalStatementsandLoopsMoreFULL;

import java.util.Scanner;

public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int symbol = input % 10;
        if (symbol == 0) {
            System.out.println("zero");
        } else if (symbol == 1) {
            System.out.println("one");
        } else if (symbol == 2) {
            System.out.println("two");
        } else if (symbol == 3) {
            System.out.println("three");
        } else if (symbol == 4) {
            System.out.println("four");
        } else if (symbol == 5) {
            System.out.println("five");
        } else if (symbol == 6) {
            System.out.println("six");
        } else if (symbol == 7) {
            System.out.println("seven");
        } else if (symbol == 8) {
            System.out.println("eight");
        } else if (symbol == 9) {
            System.out.println("nine");
        }


    }

}
