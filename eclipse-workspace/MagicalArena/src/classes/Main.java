package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("Welcome to magical Arena");
    	System.out.println();
        System.out.println("Please enter player 1 health, strength and attach value respectively in separate line and countable values");
        Player playerA = new Player(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Please enter player 2 health,strength and attach value respectively in separate line and countable values");
        sc.nextLine();
        Player playerB = new Player(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.fight();
        System.out.println("So, the winner is: " + winner.getName());
    }
}
 