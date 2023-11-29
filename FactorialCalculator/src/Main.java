import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        long value = new Scanner(System.in).nextInt();;
        long factorial = 1;
        long i = 1;

        for (i = 1; i <= value; i = i + 1) {
            factorial = factorial * i;

        }

        System.out.println("Факториал числа равен: " + factorial);
    }
}
