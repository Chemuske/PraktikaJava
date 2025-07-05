package Day7.Quest1;

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

    static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.lenght > a2.lenght) {
            System.out.println("Самолет 1 длиннее");
        } else if (a1.lenght < a2.lenght) {
            System.out.println("Самолет 2 длиннее");
        } else {
            System.out.println("Длины равны");
        }
    }

}
