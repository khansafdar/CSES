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
        System.out.println("First Attacker will be " + currentAttacker.getName() + " And Defender will be "+ currentDefender.getName());
        System.out.println();
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
        System.out.println(currentAttacker.getName()+" attacks and rolls die. Die roll : " + attackRoll);
        System.out.println("Attach Damage : " + attackDamage);
        System.out.println(currentDefender.getName()+" defends and rolls die. Die roll : " + defenseRoll);
        System.out.println("Defense : " + defense);
        int damage = attackDamage - defense;
        if (damage > 0) {
        	System.out.println("Total Damage : "+damage);
            currentDefender.takeDamage(damage);
        }else System.out.println("Total Damage : "+0);
        System.out.println("Health of Each player After Combat : ");
        System.out.println(currentAttacker.getName() + " : "+currentAttacker.getHealth());
        System.out.println(currentDefender.getName() + " : " + currentDefender.getHealth());
        System.out.println();
    }

    private void swapRoles() {
        Player temp = currentAttacker;
        currentAttacker = currentDefender;
        currentDefender = temp;
    }
}
