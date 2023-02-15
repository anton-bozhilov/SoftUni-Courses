package MethodsExercisesFULL;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1Input = Integer.parseInt(scanner.nextLine());
        int num2Input = Integer.parseInt(scanner.nextLine());
        int num3Input = Integer.parseInt(scanner.nextLine());

        smallestNum(num1Input, num2Input, num3Input);
    }

    public static void smallestNum(int num1, int num2, int num3) {
        int smallest = Math.min(Math.min(num1, num2), num3);
        System.out.println(smallest);
    }
}
