package MethodsLabFULL;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());


        for (int k = 1; k <= numInput; k++) {
            printLine(1, k);
        }

        for (int l = numInput - 1; l >= 1; l--) {
            printLine(1, l);
        }


    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
