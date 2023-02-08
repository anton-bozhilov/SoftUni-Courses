package FirstStepsInCodingFINISHED.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Firstname = scanner.nextLine();
        String LastName = scanner.nextLine();
        int Age = Integer.parseInt(scanner.nextLine());
        String Town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", Firstname, LastName, Age, Town);


    }
}
