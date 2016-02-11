import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vajrayogini on 2/11/16.
 */
public class characterTest {

    @Test
    public void testBattle() throws Exception {
        Player player = new Player(); //create test obects
        player.name = "Test Player";
        Enemy enemy = new Enemy("Test Enemy", 5, 5);
        player.battle(enemy); //call the method
        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);

    }
}