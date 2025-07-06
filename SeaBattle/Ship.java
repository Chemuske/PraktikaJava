package SeaBattle;

import java.util.Arrays;

public class Ship {
    private int [][] coordinates = new int[2][]; //Координаты корабля хранятся в виде [0] - все X координаты, [1] - все Y координаты

    /**
     * Создание корабля любого типа (задание координат)
     * 
     * @param coordinates Двумерный массив с координатами (X, Y).
     * @return true, если корабль создан, иначе false.
    */
    public boolean setCoordinates(int [][] coordinates) {
        if (checkCoordinates(coordinates)) {
            this.coordinates = coordinates;
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
    private static boolean checkCoordinates(int [][] coordinates) { //TODO: Переделать без массива checkCoordinates

        int[][] checkCoordinates = Arrays.copyOfRange(coordinates, 0, coordinates.length);

        // Проверка, что кол-во координат корректно
        if (checkCoordinates.length != 2) {
            System.out.println("FAILED check coordinates");
            return false;
        }
        if (checkCoordinates[0].length > 4 & checkCoordinates[0].length < 1 && checkCoordinates[1].length > 4 && checkCoordinates[1].length < 1) {
            System.out.println("Incorrect ship size");
            return false;
        }
        
        // Проверка однопалубного корабля
        if (coordinates[0].length == 1 || coordinates[1].length == 1) {
            if (coordinates[0][0] == coordinates[1][0]) {
                return true;
            }
        }

        // Сортировка массива для проверки по X и Y
        for (int i = 0; i < checkCoordinates.length; i++) {
            Arrays.sort(checkCoordinates[i]);
        }

        // Проверка горизонтальной линии (X постоянный, Y последовательный)
        if (checkCoordinates[0][0] == checkCoordinates[0][checkCoordinates[0].length - 1]) {
            for (int i = 1; i < checkCoordinates.length; i++) {
                if (checkCoordinates[1][i-1] < 0 && checkCoordinates[1][i-1] > 9) {
                    System.out.println("Y coordinates must be between 0 and 9");
                    return false;
                }
                if (checkCoordinates[1][i-1] + 1 != checkCoordinates[1][i]) {
                    System.out.println("Y coordinates are not valid");
                    return false;
                }
            }
        } else if (checkCoordinates[1][0] == checkCoordinates[1][checkCoordinates[1].length - 1]) {
            for (int i = 1; i < checkCoordinates.length; i++) {
                if (checkCoordinates[0][i-1] < 0 && checkCoordinates[0][i-1] > 9) {
                    System.out.println("X coordinates must be between 0 and 9");
                    return false;
                }
                if (checkCoordinates[0][i-1] + 1 != checkCoordinates[0][i]) {
                    System.out.println("X coordinates are not valid");
                    return false;
                }
            }
        } else if (checkCoordinates[0][0] != checkCoordinates[0][checkCoordinates[0].length - 1] || checkCoordinates[1][0] != checkCoordinates[1][checkCoordinates[1].length - 1]) {
            System.out.println("X and Y coordinates are not valid");
            return false;
        }
        return true;
    }
}