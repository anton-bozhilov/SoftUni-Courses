    package ConditionalStatementsAdvancedFINISHED.MoreExercises;

    import java.util.Scanner;

    public class MultiplyBy2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i >= 0; i++) {
                double num = Double.parseDouble(scanner.nextLine());
                if (num < 0) {
                    System.out.println("Negative number!");
                    break;
                }
                System.out.printf("Result: %.2f%n", num * 2);
            }
        }
    }
