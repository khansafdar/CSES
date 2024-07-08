package classes;
public class Player {
	
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
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

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int attackRoll() {
        return (int)(Math.random() * 6) + 1;
    }

    public int defenseRoll() {
        return (int)(Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
        return "Player(Health: " + health + ", Strength: " + strength + ", Attack: " + attack + ")";
    }
}
