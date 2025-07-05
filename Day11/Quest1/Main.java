package Day11.Quest1;

public class Main {
    public static void main(String[] args) {
        
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        for (int i = 0; i < 1500; i++) {
            courier.doWork();
            picker.doWork();
            System.out.println("Courier balance: " + courier.getSalary());
            System.out.println("Picker balance: " + picker.getSalary());
            System.out.println(warehouse);
        }

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);

        courier2.doWork();
        picker2.doWork();
        System.out.println("======================");
        System.out.println("Courier balance: " + courier2.getSalary());
        System.out.println("Picker balance: " + picker2.getSalary());
        System.out.println(warehouse2);

        System.out.println("======================");
        System.out.println("Courier balance: " + courier.getSalary());
        System.out.println("Picker balance: " + picker.getSalary());
        System.out.println(warehouse);
        System.out.println("======================");
    }
    
}
