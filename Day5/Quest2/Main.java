package Day5.Quest2;

public class Main {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(1999, "Red", "Model 1");

        System.out.println("Motorbike info:" + '\n' + "Model - " + bike.getModel() + '\n' + "Color - " + bike.getColor() + '\n' + "Year - " + bike.getYear());
    }
}
