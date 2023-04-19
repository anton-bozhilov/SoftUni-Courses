package AssociativeArraysLabFULL;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : numbersArr) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                int valueCurrent = counts.get(num);
                counts.put(num, valueCurrent + 1);
            }

        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n", doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }


    }
}

