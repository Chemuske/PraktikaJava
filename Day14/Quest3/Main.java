package Day14.Quest3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("Day14\\Quest3\\people.txt");
        
        System.out.println(Person.parseFileToObjList(file));
    }
}
