package Day14.Quest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File ("Day14\\Quest1\\Test.txt");
        System.out.println(printSumDigits(file));
    }

    public static int printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }
            scanner.close();


            if (count != 10) {
                throw new RuntimeException("Некорректный входной файл");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Exception: Файл не найден");
        }
        return sum;
    }
}