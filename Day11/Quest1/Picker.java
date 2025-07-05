package Day11.Quest1;

public class Picker implements Worker{
    int salary;
    Warehouse warehouse;
    boolean takeBonus = false;

    public Picker(Warehouse warehouse) {
        if (warehouse != null) {
            this.warehouse = warehouse;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void doWork(){
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);

        if (warehouse.getCountOrder() >= 1500 && takeBonus == false) {
            bonus();
        }
    }

    public void bonus() {
        salary = salary * 3;
        takeBonus = true;
    }
}
