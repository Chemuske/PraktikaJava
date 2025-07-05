package Day7.Quest1;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("p1", 123, 3000, 300);
        Airplane a2 = new Airplane("p2", 123, 3000, 300);
        Airplane.compareAirplanes(a1, a2);
    }
}
