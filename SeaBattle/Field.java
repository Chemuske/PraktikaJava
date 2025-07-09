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
    * Размещает корабль на поле, проверяя, что он не пересекается с другими кораблями и их ореолами.
    * 
    * @param coordinates Двумерный массив с координатами корабля.
    * @return true, если корабль успешно размещён, иначе false.
    */
    public boolean setShip(int[][] coordinates) {
        Ship ship = new Ship(coordinates);

        if (!ship.isAlive()) {
            return false;
        }

        int[][] shipCoordinates = ship.getCoordinates();

        // Проверка на пересечение с другими кораблями
        for (int i = 0; i < shipCoordinates[0].length; i++) {
            int x = shipCoordinates[0][i];
            int y = shipCoordinates[1][i];

            if (field[x][y] == Symbols.SHIP) {
                System.out.println("Корабль не может быть размещен на другой корабль");
                return false;
            }
        }

        // Проверяем ореолы всех уже размещённых кораблей
        for (Ship existingShip : ships) {
            Symbols[][] oreol = setOreol(existingShip);

            for (int i = 0; i < shipCoordinates[0].length; i++) {
                int x = shipCoordinates[0][i];
                int y = shipCoordinates[1][i];

                if (oreol[x][y] == Symbols.OREOL) {
                    System.out.println("Корабль не может быть размещен в ореоле другого корабля");
                    return false;
                }
            }
        }

        // Если все проверки пройдены — размещаем корабль
        for (int i = 0; i < shipCoordinates[0].length; i++) {
            int x = shipCoordinates[0][i];
            int y = shipCoordinates[1][i];
            field[x][y] = Symbols.SHIP;
        }

        ships.add(ship);
        System.out.println("Корабль успешно размещен");
        return true;
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

    public Symbols[][] getField() {
        return field;
    }

    /**
     * Меняет значение клетки в зависимости от попадания в воду или в корабль
     * @param x - координата по оси X
     * @param y - координата по оси Y
     * @return -1 - если координаты некорректны, 0 - если промах, 1 - если попадание
     */
    public int damage(int x, int y) {
        if (x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println("Координаты некорректны");
            return -1;
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
            return 1;
        } else if (field[x][y] == Symbols.WATER) {
            field[x][y] = Symbols.MISS;
            return 0;
        } else {
            System.out.println("Вы уже стреляли в эту клетку");
            return -1;
        }
    }

    /**
     * Возвращает копию поля, скрывающую символы кораблей (Symbols.SHIP).
     * 
     * @return Копия поля с заменёнными символами кораблей на Symbols.WATER.
     */
    public Symbols[][] getFieldWithoutShips() {
        
        Symbols[][] hiddenField = new Symbols[10][10];
        for (int i = 0; i < 10; i++) {
            System.arraycopy(field[i], 0, hiddenField[i], 0, 10);
        }

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (hiddenField[x][y] == Symbols.SHIP) {
                    hiddenField[x][y] = Symbols.WATER;
                }
            }
        }

        return hiddenField;
    }

    /**
     * Возвращает копию поля с ореолами корабля
     * @param ship - корабль для которого нужно получить ореолы
     * @return oreol - копия поля с ореолами корабля
     */
    private Symbols[][] setOreol(Ship ship) {
        // Создаем копию поля и копируем в него field
        Symbols[][] oreol = new Symbols[10][10];
        for (int i = 0; i < 10; i++) {
            System.arraycopy(field[i], 0, oreol[i], 0, 10);
        }


        int[] xCoords = ship.getCoordinates()[0];
        int[] yCoords = ship.getCoordinates()[1];
        
        for (int i = 0; i < xCoords.length; i++) {
            int x = xCoords[i];
            int y = yCoords[i];
            
            // Проверяем все 8 соседних клеток (для каждой клетки корабля)
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (dx == 0 && dy == 0) continue;
                    int newX = x + dx;
                    int newY = y + dy;
                    
                    if (newX >= 0 && newX < 10 && newY >= 0 && newY < 10) {
                        if (oreol[newX][newY] != Symbols.SHIP) {
                            oreol[newX][newY] = Symbols.OREOL;
                        }
                    }   
                }
            }
        }
        return oreol;
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
     * Возвращает копию field с отмеченными ореолами всех кораблей.
     * 
     * @return Копия field с ореолами.
     */
    public Symbols[][] getAllOreols() {
        // Копирование оригинального поля
        Symbols[][] oreolField = new Symbols[10][10];
        for (int i = 0; i < 10; i++) {
            System.arraycopy(field[i], 0, oreolField[i], 0, 10);
        }

        for (Ship ship : ships) {
            Symbols[][] shipOreol = setOreol(ship);

            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 10; y++) {
                    if (shipOreol[x][y] == Symbols.OREOL && oreolField[x][y] != Symbols.SHIP) {
                        oreolField[x][y] = Symbols.OREOL;
                    }
                }
            }
        }

        return oreolField;
    }

    /**  
     * Выводит поле в консоль
     * 
     * @param field - Поле которое нужно вывести
     */
    public void printField(Symbols[][] field) {
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " - ");
            for (int j = 0; j < 10; j++) {
                System.out.print(field[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Y    |  |  |  |  |  |  |  |  |  |\n  X  0  1  2  3  4  5  6  7  8  9");
    }

    /**
     * Выводит два поля рядом друг с другом в консоль.
     * 
     * @param field1 Первое поле для отображения.
     * @param field2 Второе поле для отображения.
     */
    public static void printFieldsSideBySide(Symbols[][] field1, Symbols[][] field2) {
        for (int i = 9; i >= 0; i--) {
            StringBuilder row1 = new StringBuilder();
            StringBuilder row2 = new StringBuilder();

            // Строим строку первого поля
            for (int j = 0; j < 10; j++) {
                row1.append(field1[j][i]).append(" ");
            }

            // Строим строку второго поля
            for (int j = 0; j < 10; j++) {
                row2.append(field2[j][i]).append(" ");
            }

            // Выводим строки рядом
            System.out.println(i + " - " + row1.toString() + "   " + i + " - " + row2.toString());
        }

        // Выводим подписи осей X
        System.out.println("Y    |  |  |  |  |  |  |  |  |  |         |  |  |  |  |  |  |  |  |  |");
        System.out.println("  X  0  1  2  3  4  5  6  7  8  9         0  1  2  3  4  5  6  7  8  9");
    }
}
