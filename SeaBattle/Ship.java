package SeaBattle;

import java.util.Arrays;

public class Ship {
    private int [][] coordinates = new int[2][];  //Координаты корабля хранятся в виде [0] - все X координаты, [1] - все Y координаты
    private String name;
    private int health;

    public Ship(int[][] coordinates) {
        if (setCoordinates(coordinates)) {
            System.out.println("Ship created");
        } else {
            System.out.println("Ship not created");
        }
    }

    public int[][] getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String toString() {
        return "\n" + name + "\nX: " + Arrays.toString(coordinates[0]) + "\nY: " + Arrays.toString(coordinates[1]);
    }

    /**
     * Создание корабля любого типа (задание координат)
     * 
     * @param coordinates Двумерный массив с координатами (X, Y).
     * @return true, если корабль создан, иначе false.
    */
    public boolean setCoordinates(int [][] coordinates) {
        if (checkCoordinates(coordinates)) {
            this.coordinates = coordinates;
            setStats();
            return true;
        }
        return false;
    }

    /**
     * Устанавливает статус корабля (имя, количество здоровья)
     */
    private void setStats() {
        if (coordinates[0].length == 1 && coordinates[1].length == 1) {
            this.name = "One-part ship";
            this.health = 1;
        } else if (coordinates[0].length == 2 && coordinates[1].length == 2) {
            this.name = "Two-part ship";
            this.health = 2;
        } else if (coordinates[0].length == 3 && coordinates[1].length == 3) {
            this.name = "Three-part ship";
            this.health = 3;
        } else if (coordinates[0].length == 4 && coordinates[1].length == 4) {
            this.name = "Four-part ship";
            this.health = 4;
        } else { 
            System.out.println("Unknown ship");
        }
    }

    /**
     * Уменьшает количество здоровья корабля на 1.
     * Если здоровье корабля < 0, выводит сообщение о уничтожении.
    */
    public void isDamaged() {
        if (health - 1 > 0) {
            health--;
            System.out.println("Ship damaged");
        } else {
            health--;
            System.out.println("Ship destroyed");
        }
    }

    /**
     * Проверяет, существует ли корабль в координатах (x, y)
     * @param x - координата X
     * @param y - координата Y
     * @return true, если корабль существует, иначе false.
     */
    public boolean findShipPart(int x, int y) {
        for (int i = 0; i < coordinates[0].length; i++) {
            if (coordinates[0][i] == x && coordinates[1][i] == y) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка существует ли корабль
     * @return true, если корабль существует (health > 0), иначе false.
     */
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }

    /**
     * Проверяет корректность координат корабля.
     * 
     * @param coordinates Двумерный массив с координатами (X, Y).
     * @return true, если координаты корректны, иначе false.
     */
    public static boolean checkCoordinates(int[][] coordinates) {
        
        // Проверка на размерность массива
        if (coordinates == null || coordinates.length != 2) {
            System.out.println("FAILED check coordinates");
            return false;
        }

        if (coordinates[0].length != coordinates[1].length || coordinates[0].length > 4 || coordinates[0].length < 1 || coordinates[1].length > 4 || coordinates[1].length < 1) {
            System.out.println("Incorrect ship size");
            return false;
        }
        
        int[][] checkCoordinates = Arrays.copyOfRange(coordinates, 0, coordinates.length);

        // Проверка однопалубного корабля
        if (coordinates[0].length == 1 && coordinates[1].length == 1) {
            int x = coordinates[0][0];
            int y = coordinates[1][0];

            if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
                return true;
            } else {
                System.out.println("Coordinates out of bounds");
                return false;
            }
        }
        // Сортировка координат
        for (int i = 0; i < checkCoordinates.length; i++) {
            Arrays.sort(checkCoordinates[i]);
        }

        // Проверка горизонтальной линии (X постоянный, Y последовательный)
        if (checkCoordinates[0][0] == checkCoordinates[0][checkCoordinates[0].length - 1]) {

            if (checkCoordinates[1][0] < 0 || checkCoordinates[1][0] > 9) {
                System.out.println("Y coordinates must be between 0 and 9");
                return false;
            }
            for (int i = 1; i < checkCoordinates[0].length; i++) {
                int y = checkCoordinates[1][i];

                // Проверка границ Y
                if (y < 0 || y > 9) {
                    System.out.println("Y coordinates must be between 0 and 9");
                    return false;
                }

                // Проверка последовательности Y
                if (checkCoordinates[1][i - 1] + 1 != y) {
                    System.out.println("Y coordinates are not valid");
                    return false;
                }
            }
            return true;
        }

        // Проверка вертикальной линии (Y постоянный, X последовательный)
        if (checkCoordinates[1][0] == checkCoordinates[1][checkCoordinates[1].length - 1]) {

            if (checkCoordinates[0][0] < 0 || checkCoordinates[0][0] > 9) {
                System.out.println("X coordinates must be between 0 and 9");
                return false;
            }

            for (int i = 1; i < checkCoordinates[0].length; i++) {
                int x = checkCoordinates[0][i];

                // Проверка границ X
                if (x < 0 || x > 9) {
                    System.out.println("X coordinates must be between 0 and 9");
                    return false;
                }

                // Проверка последовательности X
                if (checkCoordinates[0][i - 1] + 1 != x) {
                    System.out.println("X coordinates are not valid");
                    return false;
                }
            }
            return true;
        }

        // Если не прошли ни одну из проверок
        System.out.println("X and Y coordinates are not valid");
        return false;
    }
}