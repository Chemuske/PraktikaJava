package Day14.Try;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //String separator = File.separator;
        //String path = "Day14\\Quest1\\text.txt";

        File file = new File("Day14/Try/text.txt");
        
        try {
            Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
