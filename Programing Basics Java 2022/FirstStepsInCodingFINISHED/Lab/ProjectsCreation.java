package FirstStepsInCodingFINISHED.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int broi = Integer.parseInt(scanner.nextLine());

        int obshto = broi * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, obshto, broi);


    }
}
