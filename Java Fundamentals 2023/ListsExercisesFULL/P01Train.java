package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //String[] input = command.split(" ");
            if (command.contains("Add")) {
                int currentWagon = Integer.parseInt(command.split(" ")[1]);
                wagons.add(currentWagon);
            } else {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    if (maxCapacity - wagons.get(i) >= passengers) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int num : wagons) {
            System.out.printf("%d ", num);
        }
    }
}

