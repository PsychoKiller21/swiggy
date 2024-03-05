package MagicalArena;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @org.junit.jupiter.api.Test
    void isAlive() {
        Player player = new Player("Test Player", 50, 10, 5);
        assertTrue(player.isAlive());
        player.takeDamage(50);
        assertFalse(player.isAlive()); // Player should die after taking 50 damage
    }

    @org.junit.jupiter.api.Test
    void takeDamage() {
        Player player = new Player("Test Player", 50, 10, 5);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
        player.takeDamage(40); // Ensure health doesn't go below 0
        assertEquals(0, player.getHealth());
    }

    @org.junit.jupiter.api.Test
    void attack() {
        Player attacker = new Player("Attacker", 50, 10, 5);
        Player defender = new Player("Defender", 50, 5, 5);
        PlayerService playerService = new PlayerService();
        playerService.attack(attacker, defender);
        // Ensure that the attack causes damage to the defender
        assertTrue(defender.getHealth() < 50);
    }
}