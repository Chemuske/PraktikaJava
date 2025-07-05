package Day11.Quest1;

public class Courier implements Worker {
    int salary;
    Warehouse warehouse;
    boolean takeBonus = false;

    public Courier(Warehouse warehouse) {
        if (warehouse != null) {
            this.warehouse = warehouse;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        if (warehouse.getBalance() >= 1000000 && takeBonus == false) {
            bonus();
        }
    }

    public void bonus() {
        salary = salary * 2;
        takeBonus = true;
    }
}
