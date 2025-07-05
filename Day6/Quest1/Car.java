package Day6.Quest1;

public class Car {

    private int year;
    private String color;
    private String model;


    void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }

    int getYear() {
        return year;
    }

    String getColor() {
        return color;
    }

    String getModel() {
        return model;
    }

    void info() {
        System.out.println("It's a Car");
        return;
    }    

    int yearDifference(int year) {
        return (year - this.year);
    }
}
