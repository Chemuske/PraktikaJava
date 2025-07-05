package Day4.Quest1;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[5];
        
        System.out.println("Длина массива: " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.println(arr[i]);

            if (arr[i] > 8)
                arr2[0] += 1;

            if (arr[i] == 1)
                arr2[1] += 1;

            if (arr[i] % 2 == 0)
                arr2[2] += 1;

            if (arr[i] % 2 != 0)
                arr2[3] += 1;

            arr2[4] += arr[i];
        }
        System.out.println("Количество чисел больше 8: " + arr2[0]);
        System.out.println("Количество чисел равных 1: " + arr2[1]);
        System.out.println("Количество четных чисел: " + arr2[2]);
        System.out.println("Количество нечетных чисел: " + arr2[3]);
        System.out.println("Сумма всех элементов массива: " + arr2[4]);
        scanner.close();
    }
    
}
