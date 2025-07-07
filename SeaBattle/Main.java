package SeaBattle;

public class Main {
    public static void main(String[] args) {

        //Test.test();
        
        Field field = new Field();

        int[][] check = {{9, 9}, {9, 8}};
        int[][] check2 = {{1, 2}, {5, 5}};
        int[][] check3 = {{5, 5, 5}, {1, 2, 3}};

        field.setShip(check);
        field.setShip(check2);
        field.setShip(check3);
        field.damage(1, 5);
        field.damage(2, 5);
        field.damage(5, 1);
        field.damage(5, 2);
        field.damage(5, 3);
        field.damage(9, 9);
        field.damage(9, 8);
        field.printField();

        // System.out.println(field.getShips());

        //TODO В классе Ship должен рассчитываться ореол корабля для использования этого метода в Field

        //TODO В классе Field\Player должна учитываться победа и поражение игроков (Если кораблей 0)
        //TODO В классе Field\Player должен быть метод для начала игры (бесконечный while, пока не произойдет победа или поражение)

        //TODO Создать класс Player в котором должен быть метод для начала игры между двумя игроками (передавая их Field) в качестве агрументов
    }
}
