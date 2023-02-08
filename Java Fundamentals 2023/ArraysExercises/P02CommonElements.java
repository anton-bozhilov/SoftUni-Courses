package ArraysExercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        for (String current : secondArr) {
            for (int i = 0; i < firstArr.length; i++) {
                if (current.equals(firstArr[i])) {
                    System.out.print(current + " ");
                    break;
                }

            }
        }
    }
}
