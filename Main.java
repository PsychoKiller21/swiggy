package MagicalArena;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 20, 10, 5);
        Player player2 = new Player("Player 2", 20, 10, 10);

        ArenaService arenaService = new ArenaService();
        arenaService.startMatch(player1, player2);
    }
}