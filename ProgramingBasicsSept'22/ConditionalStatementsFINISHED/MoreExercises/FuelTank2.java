package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double priceDiesel = 2.33;
        double priceGasoline = 2.22;
        double priceGas = 0.93;
        double totalPrice = 0.0;

        if (card.equals("Yes")) {
            if (quantity > 25) {
                switch (type) {
                    case "Diesel":
                        totalPrice = ((priceDiesel - 0.12) * quantity) * 0.90;
                        break;
                    case "Gasoline":
                        totalPrice = ((priceGasoline - 0.18) * quantity) * 0.90;
                        break;
                    case "Gas":
                        totalPrice = ((priceGas - 0.08) * quantity) * 0.90;
                        break;
                }
            } else if (quantity >= 20) {
                switch (type) {
                    case "Diesel":
                        totalPrice = ((priceDiesel - 0.12) * quantity) * 0.92;
                        break;
                    case "Gasoline":
                        totalPrice = ((priceGasoline - 0.18) * quantity) * 0.92;
                        break;
                    case "Gas":
                        totalPrice = ((priceGas - 0.08) * quantity) * 0.92;
                        break;
                }
            } else {
                switch (type) {
                    case "Diesel":
                        totalPrice = ((priceDiesel - 0.12) * quantity);
                        break;
                    case "Gasoline":
                        totalPrice = ((priceGasoline - 0.18) * quantity);
                        break;
                    case "Gas":
                        totalPrice = ((priceGas - 0.08) * quantity);
                        break;
                }
            }
        } else if (card.equals("No")) {
            if (quantity > 25) {
                switch (type) {
                    case "Diesel":
                        totalPrice = (priceDiesel * quantity) * 0.90;
                        break;
                    case "Gasoline":
                        totalPrice = (priceGasoline * quantity) * 0.90;
                        break;
                    case "Gas":
                        totalPrice = (priceGas * quantity) * 0.90;
                        break;
                }
            } else if (quantity >= 20) {
                switch (type) {
                    case "Diesel":
                        totalPrice = (priceDiesel * quantity) * 0.92;
                        break;
                    case "Gasoline":
                        totalPrice = (priceGasoline * quantity) * 0.92;
                        break;
                    case "Gas":
                        totalPrice = (priceGas * quantity) * 0.92;
                        break;
                }
            } else {
                switch (type) {
                    case "Diesel":
                        totalPrice = priceDiesel * quantity;
                        break;
                    case "Gasoline":
                        totalPrice = priceGasoline * quantity;
                        break;
                    case "Gas":
                        totalPrice = priceGas * quantity;
                        break;
                }
            }
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
