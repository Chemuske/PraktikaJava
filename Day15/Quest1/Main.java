package Day15.Quest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        File fileinp = new File("Day15\\Quest1\\shoes.csv");
        File fileout = new File("Day15\\Quest1\\shoes.txt");
        Scanner scanner = new Scanner(fileinp, StandardCharsets.UTF_8.name());
        String line;
        String [] parts;

        PrintWriter pw = new PrintWriter(fileout, StandardCharsets.UTF_8.name());
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            parts = line.split(";");
            if (parts[2].equals("0")) {
                pw.println(parts[0] + ", " + parts[1] + ", " + parts[2]);
            }
            
        }
        pw.close();
        scanner.close();
    }
}
