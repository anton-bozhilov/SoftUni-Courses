package ObjectsAndClassesLabFULL;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] textArr = input.split(" ");

        Random rndGenerator = new Random();


        for (int i = 0; i < textArr.length; i++) {
            int indexX = rndGenerator.nextInt(textArr.length);
            int indexY = rndGenerator.nextInt(textArr.length);
            String oldTextX = textArr[indexX];
            textArr[indexX] = textArr[indexY];
            textArr[indexY] = oldTextX;

        }
        for (String element : textArr) {
            System.out.println(element);
        }
    }
}
