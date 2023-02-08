package DataTypesAndVariablesExerciseFULL;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggerKeg = "";
        double max = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > max) {
                max = volume;
                biggerKeg = name;
            }


        }
        System.out.println(biggerKeg);

    }
}
