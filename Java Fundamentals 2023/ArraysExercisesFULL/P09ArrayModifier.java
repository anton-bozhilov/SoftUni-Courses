package ArraysExercisesFULL;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];

            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    int element1 = numbers[index1];
                    int element2 = numbers[index2];
                    numbers[index1] = element2;
                    numbers[index2] = element1;
                    break;

                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(commandParts[1]);
                    int multiplyIndex2 = Integer.parseInt(commandParts[2]);
                    int multiplyElement1 = numbers[multiplyIndex1];
                    int multiplyElement2 = numbers[multiplyIndex2];
                    int product = multiplyElement1 * multiplyElement2;
                    numbers[multiplyIndex1] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;

            }
            command = scanner.nextLine();

        }
        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", ""));


    }
}
