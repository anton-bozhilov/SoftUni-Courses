package AssociativeArraysLabFULL;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        for (String word : inputArr) {
            String wordInLowerCase = word.toLowerCase();
            if (!countMap.containsKey(wordInLowerCase)) {
                countMap.put(wordInLowerCase, 1);
            } else {
                countMap.put(wordInLowerCase, countMap.get(wordInLowerCase) + 1);
            }
        }
        ArrayList<String> onlyOdd = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                onlyOdd.add(entry.getKey());
            }
        }

        for (int i = 0; i < onlyOdd.size(); i++) {
            System.out.print(onlyOdd.get(i));
            if (i < onlyOdd.size() - 1) {
                System.out.print(", ");
            }
        }


    }
}
