package Day16.Quest2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Day16\\Quest2\\file1.txt");
        File file2 = new File("Day16\\Quest2\\file2.txt");
        twoFiles(file1, file2);
        printFile(file2);
    }


    public static void twoFiles(File file1, File file2) {
        if (file1.exists()) file1.delete();
        if (file2.exists()) file2.delete();

        int sum = 0;
        int randomNumber;

        try {
            file1.createNewFile();
            file2.createNewFile();

            try (PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2)) {
                for (int i = 1; i <= 1000; i++) {
                    randomNumber = (int) (Math.random() * 101);
                    pw1.printf("%d\n", randomNumber);
                    sum += randomNumber;
                    
                    if (i % 20 == 0) {
                        pw2.printf("%f\n", (float)sum/20);
                        sum = 0;
                    }
                }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        
    public static void printFile(File file) {
        try (Scanner scanner = new Scanner (file)) {
            double sum = 0;
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
            System.out.println("Ответ: " + (int) (sum/50));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
