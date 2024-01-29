package day7;

public class Player {
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;
    private static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == MIN_STAMINA){
            return;
        }
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
