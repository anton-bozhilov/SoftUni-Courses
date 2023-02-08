package WhileLoop.Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favourite = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int countBooks = 0;

        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(favourite)) {
                break;
            }
            countBooks++;
            currentBook = scanner.nextLine();
        }
        if (currentBook.equals(favourite)) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }


    }
}
