package ObjectsAndClassesLabFULL;

import java.math.BigInteger;
import java.util.Scanner;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstLine = new BigInteger(scanner.nextLine());
        BigInteger secondLine = new BigInteger(scanner.nextLine());

        BigInteger result = firstLine.add(secondLine);

        System.out.println(result);
    }
}
