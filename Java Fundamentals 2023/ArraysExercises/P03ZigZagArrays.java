package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        int indexNum = 0;


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split(" ");
            if (i % 2 == 0) {
                firstArr[indexNum] = inputLine[0];
                secondArr[indexNum] = inputLine[1];
            } else {
                secondArr[indexNum] = inputLine[0];
                firstArr[indexNum] = inputLine[1];
            }
            indexNum++;
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));

    }
}
