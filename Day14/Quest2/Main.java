package Day14.Quest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File ("Day14\\Quest2\\people.txt");
        System.out.println(parseFileToStringList(file));
    }
    
    public static List<String> parseFileToStringList(File file) throws IOException {
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file);) {
            String [] parts;
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                parts = line.split(" ");
                    if (Integer.parseInt(parts[1]) < 0)
                        throw new IOException("Некорректный входной файл");
                list.add(line);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        return list;
    }
}
