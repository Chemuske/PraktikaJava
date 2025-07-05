package Day3.Quest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите делимое и делитель: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) {
                scanner.close();
                return;
            }
                System.out.println(x / y);
        }
    }
}
