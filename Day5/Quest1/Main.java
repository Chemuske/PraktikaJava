package Day5.Quest1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Red");
        car.setModel("Model 1");
        car.setYear(1999);

        System.out.println("Car color: " + car.getColor());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());
    }   
}
