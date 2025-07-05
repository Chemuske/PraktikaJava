package Day9.Quest2;

public class Rectangle extends Figure{
    
    int x, y;

    public Rectangle(int x, int y, String color) {
        super(color);
        if (x > 0 && y > 0) {
            this.x = x;
            this.y = y;
        }
    }

    public double area(){
        return (x * y);
    }

    public double perimeter(){
        return ((x + y) * 2);
    }
}
