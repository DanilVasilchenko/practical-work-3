import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        int value = new Scanner(System.in).nextInt();;
        int factorial = 1;
        int i = 1;

        for (i = 1; i <= value; i = i + 1) {
            factorial = factorial * i;

        }

        System.out.println("Факториал числа равен: " + factorial);
    }
}
