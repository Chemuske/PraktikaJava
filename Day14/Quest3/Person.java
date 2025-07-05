package Day14.Quest3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age >= 0 && name != null) {
            this.age = age;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("{name='%s', year=%d}", name, age);
    }

    static public List<Person> parseFileToObjList(File file) throws IOException {
        List<Person> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file);) {
            String [] parts;
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                parts = line.split(" ");
                    if (Integer.parseInt(parts[1]) < 0)
                        throw new IOException("Некорректный входной файл");
                list.add(new Person(parts[0], Integer.parseInt(parts[1])));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        return list;
    }
    
}
