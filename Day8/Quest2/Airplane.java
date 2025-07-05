package Day8.Quest2;

public class Airplane {
    private String producer;
    private int year, lenght, width, fuel;
    
    Airplane(String producer, int year, int lenght, int width) {
        if (producer != null) 
            this.producer = producer;
        if (year > 0)
            this.year = year;
        if (lenght > 0) 
            this.lenght = lenght;
        if (width > 0)
            this.width = width;
        this.fuel = 0;
    }

    void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    void setlenght(int lenght) {
        if (lenght > 0) {
            this.lenght = lenght;
        }
    }

    int getFuel() {
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + width + ", количество топлива в баке: " + fuel);
    }

    void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public String toString() {
        return ("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + width + ", количество топлива в баке: " + fuel);        
    }
}
