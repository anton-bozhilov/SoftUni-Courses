package ListLabFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("end")) {
            String[] tokens = commandInput.split(" ");
            switch (tokens[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(tokens[1]);
                    numbersInput.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(tokens[1]);
                    numbersInput.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int removeIndex = Integer.parseInt(tokens[1]);
                    numbersInput.remove(removeIndex);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbersInput.add(indexToInsert, numToInsert);
                    break;
            }
            commandInput = scanner.nextLine();
        }
        //System.out.println(numbersInput.toString());
        System.out.println(numbersInput.toString().replaceAll("[\\[\\],]", ""));

    }


}
