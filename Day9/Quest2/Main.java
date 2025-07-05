package Day9.Quest2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
        new Triangle(10, 10, 10, "Red"),
        new Triangle(10, 20, 30, "Green"),
        new Triangle(10, 20, 15, "Red"),
        new Rectangle(5, 10, "Red"),
        new Rectangle(40, 15, "Orange"),
        new Circle(4, "Red"),
        new Circle(10, "Red"),
        new Circle(5, "Blue")
        };

        System.out.println("Red perimeter: " + calculateRedPerimeter(figures));
        System.out.println("Red area: " + calculateRedArea(figures));
    }



    public static double calculateRedPerimeter(Figure[] figures) {
        double summ = 0; 
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                summ += figure.perimeter();
            }
        }
        return summ;
    }

    public static double calculateRedArea(Figure[] figures) {
        double summ = 0; 
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                summ += figure.area();
            }
        }
        return summ;
    }
    
}
