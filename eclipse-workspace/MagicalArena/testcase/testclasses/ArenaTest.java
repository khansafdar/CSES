package testclasses;
import classes.Arena;
import classes.Player;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArenaTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("", 50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player("", 50, 5, 10);
        assertTrue(player.isAlive());
        player.takeDamage(50);
        assertFalse(player.isAlive());
    }

    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player("", 50, 5, 10);
        player.takeDamage(10);
        assertEquals(40, player.getHealth());
    }

    @Test
    public void testArenaInitialization() {
        Player playerA = new Player("", 50, 5, 10);
        Player playerB = new Player("", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        assertEquals(playerB, arena.fight()); // Depends on health,strength, attack initialization
    }

    @Test
    public void testFight() {
        Player playerA = new Player("", 50, 5, 10);
        Player playerB = new Player("", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        Player winner = arena.fight();
        assertTrue(winner.isAlive());
        assertTrue(winner == playerA || winner == playerB);
    }
}

