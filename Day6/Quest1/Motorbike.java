package Day6.Quest1;

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

    void info() {
        System.out.println("It's a Motorbike");
        return;
    }

    int yearDifference(int year) {
        return (year - this.year);
    }
    
    //void printInfo() {
    //    System.out.println("Motorbike info:" + '\n' + "Year: " + year + '\n' + "Color: " + color + '\n' + "Model: " + model);
    //}
}
