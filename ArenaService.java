package MagicalArena;

public class ArenaService {
    private PlayerService playerService;

    public ArenaService() {
        this.playerService = new PlayerService();
    }

    public void startMatch(Player player1, Player player2) {
        Player attacker;
        Player defender;

        if (player1.getHealth() < player2.getHealth()) {
            attacker = player1;
            defender = player2;
        } else {
            attacker = player2;
            defender = player1;
        }

        while (player1.isAlive() && player2.isAlive()) {
            playerService.attack(attacker, defender);

            // Swap roles for next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (player1.isAlive()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
