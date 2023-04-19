package ArraysExercisesFULL;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= array.length - 1; index++) {
            int currentNum = array[index];
            if (index == array.length - 1) {
                System.out.print(currentNum );
            }
            boolean isTop = false;
            for (int i = index; i < array.length - 1; i++) {
                int nextNum = array[index + 1];
                if (currentNum > nextNum) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }

        }


    }
}
