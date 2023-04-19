package AssociativeArraysLabFULL;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> collection = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!collection.containsKey(word)) {
                collection.put(word, new ArrayList<>());

            }

            collection.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : collection.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }


    }

}
