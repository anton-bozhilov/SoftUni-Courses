package ListLabFULL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String current = scanner.nextLine();
            products.add(current);
        }
        Collections.sort(products);
        int index = 1;
        for (String product : products) {
            System.out.printf("%d.%s%n", index, product);
            index++;
        }
    }
}
