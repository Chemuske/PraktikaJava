package Day3.Quest3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String flag = "true";

            System.out.print("Введите делимое и делитель 5 раз: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y == 0) 
                flag = "false";
            
            switch (flag) {
                case "false":
                    System.out.println("Деление на 0");
                    flag = "true";
                    break;
            
                case "true":
                    System.out.println(x / y);
                    break;
            }
        }
        scanner.close();
    }
}
