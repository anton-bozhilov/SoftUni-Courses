package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                numbers.add(num);
            } else if (command.contains("Insert")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                if (position > numbers.size() || position < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(position, num);
                }
            } else if (command.contains("Remove")) {
                int position = Integer.parseInt(command.split(" ")[1]);
                if (position > numbers.size() || position < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(position);
                }
            } else if (command.contains("Shift left")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    numbers.add(numbers.get(0));
                    numbers.remove(0);
                }
            } else if (command.contains("Shift right")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    numbers.add(0, numbers.get(numbers.size() - 1));
                    numbers.remove(numbers.size() - 1);
                }
            }
            command = scanner.nextLine();
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
