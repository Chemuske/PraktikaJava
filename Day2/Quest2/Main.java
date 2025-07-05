package Day2.Quest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a и b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
            scanner.close();
            return;
        }
        
        for (int i = a + 1; i < b; i++)
            if (i % 5 == 0 && i % 10 != 0)
                System.out.print(i + " ");
        scanner.close();
    }
}
