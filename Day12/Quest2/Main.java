package Day12.Quest2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            list.add(i);
        }
        for (int i = 300; i <= 350; i++) {
            list.add(i);
        }

        System.err.println(list);
    }
    
}
