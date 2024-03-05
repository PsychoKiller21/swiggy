package MagicalArena;

import java.util.Random;

class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void attack(Player defender, int attackDiceRoll, int defendDiceRoll) {
        int attackingDieRoll = attackDiceRoll;
        int defendingDieRoll = defendDiceRoll;

        int attackDamage = attack * attackingDieRoll;
        int defendStrength = defender.strength * defendingDieRoll;
        int damageTaken = Math.max(0, attackDamage - defendStrength);

        defender.takeDamage(damageTaken);

        System.out.println("Attacker: " + name + ", Health: " + health +
                ", Strength: " + strength + ", Attack: " + attack +
                ", Attacker dice: " + attackingDieRoll +
                ", Defender: " + defender.getName() + ", Health: " + defender.getHealth() +
                ", Strength: " + defender.getStrength() + ", Attack: " + defender.getAttack() +
                ", Defender dice: " + defendingDieRoll);
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
    }
}


