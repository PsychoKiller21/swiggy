package MagicalArena;

import java.util.Random;

class PlayerService {
    private Random random;

    public PlayerService() {
        this.random = new Random();
    }

    public void attack(Player attacker, Player defender) {
        int attackingDieRoll = rollDie();
        int defendingDieRoll = rollDie();

        int attackDamage = attacker.getAttack() * attackingDieRoll;
        int defendStrength = defender.getStrength() * defendingDieRoll;
        int damageTaken = Math.max(0, attackDamage - defendStrength);

        defender.takeDamage(damageTaken);

        System.out.println("Attacker: " + attacker.getName() + ", Health: " + attacker.getHealth() +
                ", Strength: " + attacker.getStrength() + ", Attack: " + attacker.getAttack() +
                ", Attacker dice: " + attackingDieRoll +
                ", Defender: " + defender.getName() + ", Health: " + defender.getHealth() +
                ", Strength: " + defender.getStrength() + ", Attack: " + defender.getAttack() +
                ", Defender dice: " + defendingDieRoll);
    }

    private int rollDie() {
        return random.nextInt(6) + 1;
    }
}
