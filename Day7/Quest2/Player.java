package Day7.Quest2;

public class Player {
    private int stamina, /*MaxStamina = 100,*/ MinStamina = 0;
    private static int countPlayers = 0;
    
    Player () {
        this.stamina = (int) (Math.random()*11 + 90);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    int getStamina () {
        return stamina;
    }

    void run () {
        if (stamina > MinStamina) {
            stamina -= 1;
        } else if (stamina == MinStamina) {
            countPlayers--;
            stamina = -1;
            System.out.println("Игрок устал");
        } else {
            System.out.println("Нет выносливости");
        }
    }

    void infoPlayer () {
        System.out.println("У игрока " + stamina + " выносливости");
    }

    static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
