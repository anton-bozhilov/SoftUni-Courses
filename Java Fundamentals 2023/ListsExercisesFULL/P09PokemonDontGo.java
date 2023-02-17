package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            int addToSum = 0;
            if (index >= 0 && index <= numbers.size() - 1) {
                addToSum = numbers.get(index);
                numbers.remove(index);
            } else if (index < 0) {
                addToSum = numbers.get(0);
                numbers.set(0, numbers.get(numbers.size() - 1));

            } else if (index > numbers.size() - 1) {
                addToSum = numbers.get(numbers.size() - 1);
                numbers.set(numbers.size() - 1, numbers.get(0));

            }
            sum += addToSum;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= addToSum) {
                    numbers.set(i, numbers.get(i) + addToSum);
                } else {
                    numbers.set(i, numbers.get(i) - addToSum);
                }
            }
        }


        System.out.println(sum);
    }
}
