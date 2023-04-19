package TextProcessingLabFULL;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(key)) {
            //int index = text.indexOf(key);
            text = text.replace(key,"");
        }
        System.out.println(text);


    }
}
