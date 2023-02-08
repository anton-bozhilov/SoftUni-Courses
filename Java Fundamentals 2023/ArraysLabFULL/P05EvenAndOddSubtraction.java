package ArraysLabFULL;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddSum = 0;
        int evenSum = 0;

        //for (int i = 0; i < array.length ; i++) {

        for (int current : array) {
            if (current % 2 == 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }
        }
        System.out.println(evenSum - oddSum);


    }
}
