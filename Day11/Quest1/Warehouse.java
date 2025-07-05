package Day11.Quest1;

public class Warehouse {
    private int countOrder;
    private int balance;
    

    public void setCountOrder(int countOrder) {
        if (countOrder > 0) {
            this.countOrder = countOrder;
        }
    }
    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public String toString() {
        return ("Warehouse: Balance = " + balance + "; Count order = " + countOrder);
    }
}
