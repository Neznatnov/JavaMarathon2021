package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);

      Player.info();

        int player3Stamina = player3.getStamina();
        for (int i = 0; i < player3Stamina; i++) {
            player3.run();
        }
        int player4Stamina = player4.getStamina();
        for (int i = 0; i < player4Stamina; i++) {
            player4.run();
        }

        Player.info();
    }

}
