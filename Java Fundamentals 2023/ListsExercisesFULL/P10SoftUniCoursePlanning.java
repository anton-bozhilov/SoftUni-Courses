package ListsExercisesFULL;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> text = Arrays.stream(input.split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String type = command.split(":")[0];
            switch (type) {
                case "Add":
                    String lessonToAdd = command.split(":")[1];
                    if (!text.contains(lessonToAdd)) {
                        text.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToInsert = command.split(":")[1];
                    int index = Integer.parseInt(command.split(":")[2]);
                    if (!text.contains(lessonToInsert)) {
                        text.add(index, lessonToInsert);
                    }
                    break;
                case "Remove":
                    String lessonToRemove = command.split(":")[1];
                    if (text.contains(lessonToRemove)) {
                        text.remove(lessonToRemove);
                    }
                    int indexLessonToRemove = text.indexOf(lessonToRemove);
                    if (text.get(indexLessonToRemove + 1).equals(lessonToRemove + "-Exercise")) {
                        text.remove(indexLessonToRemove + 1);
                    }
                    break;
                case "Swap":
                    String lessonToSwap1 = command.split(":")[1];
                    String lessonToSwap2 = command.split(":")[2];
                    if (text.contains(lessonToSwap1) && text.contains(lessonToSwap2)) {
                        int index1 = text.indexOf(lessonToSwap1);
                        int index2 = text.indexOf(lessonToSwap2);
                        text.set(index1, lessonToSwap2);
                        text.set(index2, lessonToSwap1);
                    }
                    String exercise1 = lessonToSwap1 + "-Exercise";
                    String exercise2 = lessonToSwap2 + "-Exercise";
                    if (text.contains(exercise1)) {
                        text.remove(text.indexOf(exercise1));
                        text.add(text.indexOf(lessonToSwap1 + 1), exercise1);
                    }
                    if (text.contains(exercise2)) {
                        text.remove(text.indexOf(exercise2));
                        text.add(text.indexOf(lessonToSwap2) + 1, exercise2);
                    }
                    break;
                case "Exercise":
                    String lesson = command.split(":")[1];
                    String exercise = lesson + "-Exercise";
                    int indexOfLesson = text.indexOf(lesson);
                    if (text.contains(lesson)) {
                        if (indexOfLesson == text.size() - 1) {
                            text.add(exercise);
                        } else if (!text.get(indexOfLesson + 1).equals(exercise)) {
                            text.add(indexOfLesson + 1, exercise);
                        }
                    } else {
                        text.add(lesson);
                        text.add(exercise);
                    }

                    break;
            }
            command = scanner.nextLine();
        }
        int index = 1;
        for (String tittle : text) {
            System.out.printf("%d.%s%n", index, tittle);
            index++;
        }

    }
}
