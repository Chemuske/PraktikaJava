package Day16.Quest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Day16\\Quest1\\test.txt");
        System.out.println(printResult(file) + " --> " + String.format("%.3f", printResult(file)));
    }

    public static Double printResult(File file) {
        int sum = 0;
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        return (double) sum / count;
    }
    
}
