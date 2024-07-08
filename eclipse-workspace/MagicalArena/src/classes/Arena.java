package classes;
public class Arena {
    private Player player1;
    private Player player2;
    private Player currentAttacker;
    private Player currentDefender;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentAttacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
        this.currentDefender = this.currentAttacker == player1 ? player2 : player1;
    }

    public Player fight() {
        while (player1.isAlive() && player2.isAlive()) {
            attack();
            swapRoles();
        }
        return player1.isAlive() ? player1 : player2;
    }

    private void attack() {
        int attackRoll = currentAttacker.attackRoll();
        int defenseRoll = currentDefender.defenseRoll();

        int attackDamage = currentAttacker.getAttack() * attackRoll;
        int defense = currentDefender.getStrength() * defenseRoll;

        int damage = attackDamage - defense;
        if (damage > 0) {
            currentDefender.takeDamage(damage);
        }
    }

    private void swapRoles() {
        Player temp = currentAttacker;
        currentAttacker = currentDefender;
        currentDefender = temp;
    }
}
