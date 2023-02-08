package ConditionalStatementsFINISHED.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int VpoolL = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double VforMissingL = (p1 + p2) * H;
        double VforMissingLPro = VforMissingL * 100 / VpoolL;
        double p1Procent = (p1 * H) * 100 / VforMissingL;
        double p2Procent = (p2 * H) * 100 / VforMissingL;
        //The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%.
        if (VpoolL >= VforMissingL) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", VforMissingLPro, p1Procent, p2Procent);
        } else //For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, VforMissingL - VpoolL);


    }
}
