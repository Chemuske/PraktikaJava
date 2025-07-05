package Day6.Quest1;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1000, 1000000000, 222222222);

        airplane.setYear(1999);
        airplane.setlenght(1234567899);
        airplane.fillUp(5);
        airplane.fillUp(10);
        airplane.info();
    }
    
}
