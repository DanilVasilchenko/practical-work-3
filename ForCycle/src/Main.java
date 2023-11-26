import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value = new Scanner(System.in).nextInt();
        int i = 1;
        int n = 1;


        for (i = 0; i <= value; i = i + 1) {

            for (n = 0; n <= value; n = n + 1) {

                if (i * n == value) {

                    System.out.println(i + " * " + n + " = " + value);

                }
            }
        }
    }
}
