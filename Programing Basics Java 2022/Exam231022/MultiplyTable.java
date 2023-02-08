package Exam231022;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int last = input % 10;
        int second = input / 10 % 10;
        int first =  input /100;

        for (int i = 1; i <= last; i++) {
            for (int j = 1; j <= second; j++) {
                for (int k = 1; k <= first; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k , i * j *k);
                }

            }

        }


    }
}
