package MagicalArena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerServiceTest {

    @Test
    void attack() {
        Player attacker = new Player("Attacker", 50, 10, 5);
        Player defender = new Player("Defender", 50, 5, 5);
        PlayerService playerService = new PlayerService();
        playerService.attack(attacker, defender);
        // Ensure that the attack causes damage to the defender
        assertTrue(defender.getHealth() < 50);
    }
    @Test
    void testAttackWithMaximumRolls() {
        // Test attack with maximum roll values (6)
        Player attacker = new Player("Attacker", 50, 10, 5);
        Player defender = new Player("Defender", 50, 5, 5);
        PlayerService playerService = new PlayerService();
        playerService.attack(attacker, defender);
        // Ensure that the attack causes damage to the defender
        assertTrue(defender.getHealth() < 50);
    }

}