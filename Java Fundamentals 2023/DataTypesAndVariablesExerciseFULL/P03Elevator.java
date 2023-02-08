package DataTypesAndVariablesExerciseFULL;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int sum = (int) Math.ceil((double) persons / capacity);
        System.out.println(sum);
    }
}
