package Day9.Quest2;

public abstract class Figure {

    String color;

    Figure(String color) {
        if (color != null)
            this.color = color;
    }
    
    void setColor(String color) {
        if (color != null)
            this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract double area();
    abstract double perimeter();
}