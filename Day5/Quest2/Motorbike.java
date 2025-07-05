package Day5.Quest2;

public class Motorbike {
    
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        if (year > 0)
            this.year = year;
        if (color != null)
            this.color = color;
        if (model != null)
            this.model = model;
    }

    String getColor() {
        return color;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }
}
