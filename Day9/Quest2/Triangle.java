package Day9.Quest2;

public class Triangle extends Figure{

    int x, y, z;

    public Triangle(int x, int y, int z, String color) {
        super(color);
        if (x > 0 && y > 0 && z > 0 && 
        x + y > z && x + z > y && y + z > x) {
            this.x = x;
            this.y = y;
            this.z = z;
        } 
    }


    public double area(){
        // Полупериметр
        double s = perimeter() / 2.0;
        // Формула Герона: √(s*(s-a)*(s-b)*(s-c))
        return Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }

    public double perimeter(){
        return x + y + z;
    }


}