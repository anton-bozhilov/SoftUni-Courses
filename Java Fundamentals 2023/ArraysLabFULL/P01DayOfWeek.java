package ArraysLabFULL;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] array = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                " Sunday"
        };
        if (n >= 1 && n <= 7) {
            System.out.println(array[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }


    }
}
