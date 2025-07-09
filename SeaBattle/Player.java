package SeaBattle;

import java.util.Scanner;

public class Player {
    
    private String name;
    private boolean isTurn = true;

    public Player(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public String getName() {
        return name;
    }

    /**
     * Начинает игру между игроками
     * @param player2 - игрок против которого играем
     */
    public void startGame(Player player2) {
        
        Player[] players = new Player[2];
        Field[] fields = new Field[2];
        players[0] = this;
        players[1] = player2;

        Scanner scanner = new Scanner(System.in);

        try {

            for (int i = 0; i < 2; i++) {

                if (i == 1) {
                    for (int j = 0; j < 25; j++) {
                        System.out.println("\n");
                    }
                }
                
                // Расстановка кораблей для каждого игрока
                System.out.println("Игрок " + players[i].getName() + " размещает корабли");
                fields[i] = new Field();

                System.out.println("Введите координаты четырехпалубного корабля (в формате x,y; x,y; x,y; x,y)");
                setShipInGame(fields[i], scanner, 4);

                for (int j = 0; j < 2; j++) {
                    System.out.println("Введите координаты " + (j+1) + "-го трехпалубного корабля (в формате x,y; x,y; x,y)");
                    setShipInGame(fields[i], scanner, 3);
                }

                for (int j = 0; j < 3; j++) {
                    System.out.println("Введите координаты " + (j+1) + "-го двухпалубного корабля (в формате x,y; x,y)");
                    setShipInGame(fields[i], scanner, 2);
                }

                for (int j = 0; j < 4; j++) {
                    System.out.println("Введите координаты " + (j+1) + "-го однопалубного корабля (в формате x,y)");
                    setShipInGame(fields[i], scanner, 1);
                }

                if (i == 1) {
                    for (int j = 0; j < 25; j++) {
                        System.out.println("\n");
                    }
                }
            }

        // Начало игры
            boolean gameStarted = true;


            System.out.println("Начинается игра между " + this.getName() + " и " + player2.getName());

            while (gameStarted) {
                if (isTurn) {
                    System.out.println("\nХодит игрок " + this.getName());
                } else {
                    System.out.println("\nХодит игрок " + player2.getName());
                }


                System.out.print("Введите координаты для выстрела в формате (x,y): ");
                String input = scanner.nextLine();

                int[][] coordinates = stringToCoordinates(input);

                if (coordinates == null || coordinates[0].length != 1) {
                    System.out.println("Ошибка! Введите координаты в формате x,y");
                    continue;
                }

                int x = coordinates[0][0];
                int y = coordinates[1][0];

                int check = isTurn ? fields[1].damage(x, y) : fields[0].damage(x, y);

                // Проверка на попадание
                switch (check) {
                    case 0:
                        System.out.println("Промах!\n");
                        Field.printFieldsSideBySide(fields[0].getFieldWithoutShips(), fields[1].getFieldWithoutShips());
                        isTurn = !isTurn;
                        break;
                    case 1, -1:
                        Field.printFieldsSideBySide(fields[0].getFieldWithoutShips(), fields[1].getFieldWithoutShips());
                        break;
                }

                // Проверка на победу
                if (isWin(fields[isTurn ? 1 : 0])) {
                    System.out.println("\nИгрок " + (!isTurn ? player2.getName() : this.getName()) + " победил!");
                    gameStarted = false;
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    /**
     * Устанавливает корабль в поле и выводит его на экран
     * @param field - поле на которое устанавливается корабль
     */
    private void setShipInGame(Field field, Scanner scanner, int expectedDecks) {
        while (true) {
            int[][] coordinates = stringToCoordinates(scanner.nextLine());

            if (coordinates == null || coordinates[0].length != expectedDecks) {
               System.out.print("Ошибка! Количество координат должно быть равно " + expectedDecks + ". \n Повторите ввод: ");
                continue;
            }

            if (field.setShip(coordinates)) {
                field.printField(field.getAllOreols());
                break;
            } else {
                System.out.println("Введите координаты корабля заново");
            }
        }
    }

    private boolean isWin(Field field) {
        if (field.getShips().size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Преобразует строку формата "x,y; x,y; x,y" в двумерный массив координат.
     * 
     * @param strCoords Строка с координатами.
     * @return Двумерный массив [[x1, x2, ...], [y1, y2, ...]].
     */
    private int[][] stringToCoordinates(String strCoords) {
        if (strCoords == null || strCoords.trim().isEmpty()) {
            System.out.println("Invalid coordinates: null or empty");
            return null;
        }

        strCoords = strCoords.replaceAll("\\s+", ""); // \\s — любой пробельный символ (эквивалент [\t\n\x0B\f\r \u00a0\u2000-\u200b\u2028\u2029]).

        // Разделяем строку на пары координат по ";"
        String[] pairs = strCoords.split(";");
        if (pairs.length == 0) {
            System.out.println("Invalid coordinates: no pairs found");
            return null;
        }

        int[][] coordinates = new int[2][pairs.length];

        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            if (!pair.contains(",")) {
                System.out.println("Invalid coordinates: missing comma in pair at index " + i);
                return null;
            }

            String[] xy = pair.split(",");
            if (xy.length != 2) {
                System.out.println("Invalid coordinates: invalid pair format at index " + i);
                return null;
            }

            try {
                coordinates[0][i] = Integer.parseInt(xy[0]); // X
                coordinates[1][i] = Integer.parseInt(xy[1]); // Y
            } catch (NumberFormatException e) {
                System.out.println("Invalid coordinates: non-integer value at index " + i);
                return null;
            }
        }

        return coordinates;
    }

}
