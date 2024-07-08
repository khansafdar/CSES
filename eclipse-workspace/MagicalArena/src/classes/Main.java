package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("Welcome to magical Arena");
    	System.out.println("Please Enter Player 1 Health, Strength And Attach Value Respectively");
        Player playerA = new Player(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Please Enter Player 2 Health, Strength And Attach Value Respectively");
        Player playerB = new Player(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.fight();
        System.out.println("The winner is: " + winner);
    }
}
