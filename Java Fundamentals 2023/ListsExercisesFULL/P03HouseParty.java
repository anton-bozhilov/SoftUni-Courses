package ListsExercisesFULL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.contains("not")) {
                String name = command.split(" ")[0];
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            } else {
                String name = command.split(" ")[0];
                if (!guests.contains(name)) {
                    guests.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }

            }
        }
        for (String name : guests) {
            System.out.println(name);
        }

    }
}
