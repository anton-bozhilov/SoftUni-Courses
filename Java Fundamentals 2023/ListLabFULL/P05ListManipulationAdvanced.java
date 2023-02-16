package ListLabFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            if (command.contains("Contains")) {
                int number = Integer.parseInt(input[1]);
                if (numbers.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (command.contains("Print")) {
                String typeNum = input[1];
                if (typeNum.equals("even")) {
                    for (int num : numbers) {
                        if (num % 2 == 0) {
                            System.out.printf("%d ", num);
                        }
                    }
                    System.out.println();

                } else if (typeNum.equals("odd")) {
                    for (int num : numbers) {
                        if (num % 2 != 0) {
                            System.out.printf("%d ", num);
                        }
                    }
                    System.out.println();
                }

            } else if (command.contains("Get")) {
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println(sum);

            } else if (command.contains("Filter")) {
                String action = input[1];
                int num = Integer.parseInt(input[2]);
                switch (action) {
                    case "<":
                        for (int current : numbers) {
                            if (current < num) {
                                System.out.printf("%d ", current);
                            }
                        }
                        break;
                    case ">":
                        for (int current : numbers) {
                            if (current > num) {
                                System.out.printf("%d ", current);
                            }
                        }
                        break;
                    case "<=":
                        for (int current : numbers) {
                            if (current <= num) {
                                System.out.printf("%d ", current);
                            }
                        }
                        break;
                    case ">=":
                        for (int current : numbers) {
                            if (current >= num) {
                                System.out.printf("%d ", current);
                            }
                        }
                        break;
                }
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
