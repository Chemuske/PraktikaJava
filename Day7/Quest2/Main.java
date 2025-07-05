package Day7.Quest2;

public class Main {
    public static void main(String[] args) {

        Player[] players = new Player[7]; 
        for (int i = 0; i < 6; i++) {
            players[i] = new Player();
            Player.info();
        }

        for (int i = 0; i < 100; i++) {
            players[0].run();
            players[1].run();
        }
        Player.info();
    }
    
}
