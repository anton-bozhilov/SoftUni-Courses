package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                numbers.removeIf(n -> n == num);
            } else if (command.contains("Insert")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, num);
            }

            command = scanner.nextLine();
        }
        for (int current : numbers) {
            System.out.printf("%d ", current);
        }
    }
}
