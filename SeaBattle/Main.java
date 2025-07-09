package SeaBattle;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        
        player1.startGame(player2);

        // 1,1; 1,3; 1,2; 1,4
        // 5,1; 5,2; 5,3
        // 7,6; 7,7; 7,8
        // 3,3; 3,4
        // 7,0; 8,0
        // 9,9; 9,8
        // 0,9
        // 0,6
        // 4,6
        // 5,8
    }
}
