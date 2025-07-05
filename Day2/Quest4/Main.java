package Day2.Quest4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        if (x <-3) {
            System.out.println("y = " + 420);
            scanner.close();
            return;
        }
        
        if (x > -3 && x < 5) {
            System.out.println("y = " + (x+3)*(x*x-2));
            scanner.close();
            return;
        }
        
        if (x >= 5) {
            System.out.println("y = " + (x*x - 10)/(x + 7));
            scanner.close();
            return;
        }
        scanner.close();
    }
    
}
