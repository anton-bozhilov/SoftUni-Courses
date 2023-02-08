package ConditionalStatementsFINISHED.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vid = scanner.nextLine();
        //Ако фигурата е квадрат (square): на следващия ред
        // се чете едно дробно число - дължина на страната му
        //
        //· Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две
        // дробни числа - дължините на страните му
        //
        //· Ако фигурата е кръг (circle): на следващия ред чете
        // едно дробно число - радиусът на кръга
        //
        //· Ако фигурата е триъгълник (triangle): на следващите два реда четат
        // две дробни числа - дължината на страната му и дължината на височината към нея
        if (vid.equals("square")) {
            double size1 = Double.parseDouble(scanner.nextLine());

            System.out.printf("%.3f", size1 * size1);
        } else if (vid.equals("rectangle")) {
            double size1 = Double.parseDouble(scanner.nextLine());
            double size2 = Double.parseDouble(scanner.nextLine());
            double lice2 = size1 * size2;
            System.out.printf("%.3f", lice2);
        } else if (vid.equals("circle")) {
            double size1 = Double.parseDouble(scanner.nextLine());
            double lice3 = Math.PI * (size1 * size1);
            System.out.printf("%.3f", lice3);
        } else if (vid.equals("triangle")) {
            double size1 = Double.parseDouble(scanner.nextLine());
            double size2 = Double.parseDouble(scanner.nextLine());
            double lice4 = (size1 * size2) / 2;
            System.out.printf("%.3f", lice4);
        }

    }
}
