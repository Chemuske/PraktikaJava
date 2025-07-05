package Day12.Quest1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Car1");
        cars.add("Car2");
        cars.add("Car3");
        cars.add("Car4");
        cars.add("Car5");

        for (String car : cars) {
            System.out.print(car + '\t');
        }

        System.out.println();
        cars.add(3,"Car6");
        System.out.println("Удален - " + cars.remove(0));

        for (String car : cars) {
            System.out.print(car + '\t');
        }

    }
    
}
