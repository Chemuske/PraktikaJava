package SeaBattle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Field {

    private Symbols[][] field = new Symbols[10][10];
    private List <Ship> ships = new ArrayList<>();

    public Field() {
        this.setEmpty();
    }

    /**
     * Добавляет корабль на поле
     * 
     * @param coordinates - Двумерный массив с координатами (X, Y)
     * 
     */
    public void setShip(int[][] coordinates) {
        Ship ship = new Ship(coordinates);
        if (ship.isAlive()) {
            ships.add(ship);
            int[][] shipCoordinates = ship.getCoordinates(); 
            for (int i = 0; i < shipCoordinates[0].length; i++) {
                field[shipCoordinates[0][i]][shipCoordinates[1][i]] = Symbols.SHIP;
            }
        }
    }

    /**
     * Заполняет поле "Водой"
     */
    private void setEmpty() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == null) {
                    field[i][j] = Symbols.WATER;
                }
            }
        }
    }

    public List<Ship> getShips() {
        return ships;
    }

    /**
     * Меняет значение клетки в зависимости от попадания в воду или в корабль
     * @param x - координата по оси X
     * @param y - координата по оси Y
     * @return true - если координаты корректны и цель - корабль или вода, false - если координаты некорректны или цель - попадание
     */
    public boolean damage(int x, int y) {
        if (x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println("Координаты некорректны");
            return false;
        }

        if (field[x][y] == Symbols.SHIP) {
            field[x][y] = Symbols.DAMAGE;

            Iterator<Ship> iterator = ships.iterator();
            while (iterator.hasNext()) {
                Ship ship = iterator.next();
                if (ship.findShipPart(x, y)) {
                    ship.isDamaged();

                    if (!ship.isAlive()) {
                        deadShip(ship);
                        iterator.remove();
                    }
                }
            }
            return true;
        } else if (field[x][y] == Symbols.WATER) {
            field[x][y] = Symbols.MISS;
            return true;
        } else {
            System.out.println("Вы уже стреляли в эту клетку");
            return false;
        }
    }

    /**
     * Заменяет поля воды вокруг убитого корабля на Symbols.MISS
     * @param ship - убитый корабль
     */
    private void deadShip(Ship ship) {
        if (!ship.isAlive()) {
           int[] x = ship.getCoordinates()[0];
           int[] y = ship.getCoordinates()[1];
           for (int i : x) {
            for (int j : y) {
            // Проверяем все 8 соседних клеток (для каждой клетки корабля)
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {

                    if (dx == 0 && dy == 0) continue;

                    int newX = i + dx;
                    int newY = j + dy;

                    if (newX >= 0 && newX < 10 && newY >= 0 && newY < 10) {
                        if (field[newX][newY] == Symbols.WATER) {
                            field[newX][newY] = Symbols.MISS;
                        }
                    }
                }
            }            
            }
           }
        }   
    }

    /**  
     * Выводит поле в консоль
     */
    public void printField() {
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " - ");
            for (int j = 0; j < 10; j++) {
                System.out.print(field[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Y    |  |  |  |  |  |  |  |  |  |\n  X  0  1  2  3  4  5  6  7  8  9");
    }
}
