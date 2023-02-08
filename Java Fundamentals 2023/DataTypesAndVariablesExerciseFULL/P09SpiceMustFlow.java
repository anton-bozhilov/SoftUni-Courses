package DataTypesAndVariablesExerciseFULL;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int storage = 0;

        while (yield >= 100) {
            count++;
            storage = storage + yield - 26;
            yield -= 10;
        }
        if (count>0) {
            storage -= 26;
        }
        System.out.println(count);
        System.out.println(storage);

    }
}
