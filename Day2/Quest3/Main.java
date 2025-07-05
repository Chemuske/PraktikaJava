package Day2.Quest3;

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
        
        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0)
                System.out.print(a + " ");
            a++;
        }
        scanner.close();
    }
    
}
