import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        int attempt = -1;

        while (attempt != value) {
            System.out.println("Введите предпологаемое число: ");
             attempt = new Scanner(System.in).nextInt();

            if (attempt < value) {
                System.out.println("Ваше число меньше загаданного, введите новое число: ");
            }

            if (attempt > value) {
                System.out.println("Ваше число больше загаданного, введите новое число: ");
            }

            if (attempt == value) {
                System.out.println("Вы угадали число, поздравляем! Ваше число: " + value);
            }
        }
    }
}
