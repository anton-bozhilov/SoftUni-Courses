package ListLabFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        List<String> firstLine = Arrays.stream(input1.split(" ")).collect(Collectors.toList());
        List<String> secondLine = Arrays.stream(input2.split(" ")).collect(Collectors.toList());

        mergingList(firstLine, secondLine);
    }

    public static void mergingList(List<String> first, List<String> second) {
        List<String> merged;
        if (first.size() >= second.size()) {
            merged = first;
            int index = 1;
            for (int i = 0; i < second.size(); i++) {
                merged.add(index, second.get(i));
                index += 2;
            }
        } else {
            merged = second;
            int index = 0;
            for (int i = 0; i < first.size(); i++) {
                merged.add(index, first.get(i));
                index += 2;
            }

        }
        System.out.println(String.join(" ", merged));
    }
}
