package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input2 = scanner.nextLine();
        int bombNumber = Integer.parseInt(input2.split(" ")[0]);
        int power = Integer.parseInt(input2.split(" ")[1]);

        while (numbers.contains(bombNumber)) {
            int elementIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, numbers.size() - 1);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
