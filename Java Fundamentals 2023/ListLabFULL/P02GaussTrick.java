package ListLabFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        printSumOfNumbers(numberInput);
    }

    public static void printSumOfNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() / 2; i++) {
            System.out.printf("%d ", numbers.get(i) + numbers.get(numbers.size() - 1 - i));

        }
        if (numbers.size() % 2 != 0) {
            System.out.printf("%d", numbers.get(numbers.size() / 2));
        }
    }
}
