package Day2.Quest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите кол-во этажей: ");
        int floor = scanner.nextInt();

        if (floor >= 1 && floor <= 4)
            System.out.println("Малоэтажный дом");
        else if (floor >= 5 && floor <= 8)
            System.out.println("Среднеэтажный дом");
        else if (floor >= 9)
            System.out.println("Многоэтажный дом");
        else 
            System.out.println("Ошибка ввода");
        scanner.close();
    }
    
}
