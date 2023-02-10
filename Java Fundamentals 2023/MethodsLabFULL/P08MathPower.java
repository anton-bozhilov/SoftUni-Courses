package MethodsLabFULL;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numInput = Double.parseDouble(scanner.nextLine());
        int timesInput = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(maxPower(numInput, timesInput)));
    }

    public static double maxPower(double num, int times) {
        double result = 1;
        for (int i = 0; i < times; i++) {
            result = result * num;
        }
        return result;
    }
}
