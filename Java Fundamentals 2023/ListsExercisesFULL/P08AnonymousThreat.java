package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> lineInput = Arrays.stream(input.split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > lineInput.size() - 1) {
                    endIndex = lineInput.size() - 1;
                }
                if (startIndex >= 0 && startIndex <= lineInput.size() - 1 && endIndex >= 0 && endIndex <= lineInput.size() - 1) {
                    String mergedItems = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = lineInput.get(index);
                        mergedItems += current;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        lineInput.remove(startIndex);
                    }
                    lineInput.add(startIndex, mergedItems);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= lineInput.size() - 1) {
                    String textToDivide = lineInput.get(index);
                    lineInput.remove(index);
                    int countSymbolsEachPart = textToDivide.length() / parts;
                    int startIndex = 0;
                    for (int part = 1; part < parts; part++) {
                        String textEachPart = textToDivide.substring(startIndex, startIndex + countSymbolsEachPart);
                        lineInput.add(index, textEachPart);
                        index++;
                        startIndex += countSymbolsEachPart;
                    }
                    String textLastParts = textToDivide.substring(startIndex, textToDivide.length());
                    lineInput.add(index, textLastParts);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", lineInput));
    }
}
