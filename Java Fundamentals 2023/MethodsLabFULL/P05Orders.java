package MethodsLabFULL;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        printPrice(productInput, quantityInput);
    }

    public static void printPrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = quantity * 1.50;
                break;
            case "water":
                price = quantity * 1.00;
                break;
            case "coke":
                price = quantity * 1.40;
                break;
            case "snacks":
                price = quantity * 2.00;
                break;
        }
        System.out.printf("%.2f", price);
    }

}
