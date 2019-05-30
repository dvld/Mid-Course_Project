package dice_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

public class GameTest {

	private Dice testDice;
	private Player testPlayer;
	
	// ensures addDice function calculation is within range of possibilities
	@Test
	public void addDiceTest() {
		assertTrue(Game.addDice() > 1);
		assertTrue(Game.addDice() <= 12);
	}
	
	
	// ensures that player object wins and losses increment upon corresponding condition
	@Test
	public void playGameTest() {
//		instantiate test objects
//		testPlayer = new Player(0, 0);
//		testDice = new Dice(6);
		
		assertEquals("You win current wins: 1", Game.playGame(7));
		assertEquals(1, Game.player_1.getWins());
		assertEquals("You win current wins: 2", Game.playGame(11));
		assertEquals(2, Game.player_1.getWins());
		assertEquals("You lose current losses: 1", Game.playGame(2));
		assertEquals(1, Game.player_1.getLosses());
		assertEquals("You lose current losses: 2", Game.playGame(3));
		assertEquals(2, Game.player_1.getLosses());
		assertEquals("You lose current losses: 3", Game.playGame(12));
		assertEquals(3, Game.player_1.getLosses());
		
	}
	
}
