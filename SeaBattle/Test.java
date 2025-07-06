package SeaBattle;

public class Test {
    public static void test() {        
        // Однопалубный корабль
        int[][] singleDeck = {{5}, {5}};
        System.out.println("True - singleDeck " + Ship.checkCoordinates(singleDeck)+ '\n'); // true
        
        // Однопалубный корабль
        int[][] singleDeck2 = {{0}, {9}};
        System.out.println("True - singleDeck2 " + Ship.checkCoordinates(singleDeck2)+ '\n'); // true

        // Однопалубный корабль
        int[][] singleDeck3 = {{-1}, {2}};
        System.out.println("True - singleDeck3 " + Ship.checkCoordinates(singleDeck3)+ '\n'); // true

        // Горизонтальный корабль (3 палубы)
        int[][] horizontal = {{3, 3, 3}, {1, 2, 3}};
        System.out.println("True - horizontal " + Ship.checkCoordinates(horizontal)+ '\n'); // true
        
        // Горизонтальный корабль (3 палубы в другой последовательности)
        int[][] horizontal2 = {{3, 3, 3}, {2, 1, 3}};
        System.out.println("True - horizontal2 " + Ship.checkCoordinates(horizontal2)+ '\n'); // true

        // Вертикальный корабль (3 палубы в другой последовательности)
        int[][] vertical = {{3, 1, 2}, {2, 2, 2}};
        System.out.println("True - vertical " + Ship.checkCoordinates(vertical)+ '\n'); // true
        
        // Вертикальный корабль (3 палубы)
        int[][] vertical2 = {{1, 2, 3}, {5, 5, 5}};
        System.out.println("True - vertical2 " + Ship.checkCoordinates(vertical2)+ '\n'); // true

        // Некорректный корабль (диагональ)
        int[][] diagonal = {{1, 2, 3}, {1, 2, 3}};
        System.out.println("False - diagonal " + Ship.checkCoordinates(diagonal)+ '\n'); // false
        
        // Некорректный корабль (вне поля)
        int[][] outOfRange = {{-1, 1, 0}, {2, 2, 2}};
        System.out.println("False - outOfRange " + Ship.checkCoordinates(outOfRange)+ '\n'); // false 
        
        // Некорректный корабль (вне поля)
        int[][] outOfRange2 = {{1, 1, 1}, {-1, 0, 1}};
        System.out.println("False - outOfRange2 " + Ship.checkCoordinates(outOfRange2)+ '\n'); // false 

        // Некорректный корабль (разные поля)
        int[][] randomRange = {{1, 3, 2, 4}, {2, 2, 2}};
        System.out.println("False - randomRange " + Ship.checkCoordinates(randomRange)+ '\n'); // false
        
        // Некорректный корабль (3 поля)
        int[][] randomRange2 = {{1, 3, 2}, {2, 2, 2}, {2, 1 ,3}};
        System.out.println("False - randomRange2 " + Ship.checkCoordinates(randomRange2)+ '\n'); // false

        // Некорректный корабль (длина > 4)
        int[][] randomRange3 = {{1, 3, 2, 4, 5}, {2, 2, 2, 2, 2}};
        System.out.println("False - randomRange3 " + Ship.checkCoordinates(randomRange3)+ '\n'); // false

        // Некорректный корабль (null)
        int[][] nullShip = null;
        System.out.println("False - nullShip " + Ship.checkCoordinates(nullShip)+ '\n'); // false
    }
}
