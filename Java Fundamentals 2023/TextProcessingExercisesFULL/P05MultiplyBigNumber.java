package TextProcessingExercisesFULL;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNum.multiply(BigInteger.valueOf(secondNum)));


    }
}
