package Day9.Quest2;

public class Circle extends Figure{
    
    int r;

    public Circle(int r, String color) {
        super(color);
        if(r > 0){
            this.r = r;
        }
    }

    public double area(){
        return (Math.PI * r * r);
    }

    public double perimeter(){
        return (2 * Math.PI * r);
    }
}
