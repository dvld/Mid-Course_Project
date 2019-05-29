package dice_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

public class PlayerTest {

	private Player testPlayer;
	
	@Test
	public void constructorTest() {
		
		testPlayer = new Player(0, 0);
		
		assertEquals(0, testPlayer.getWins());
		assertEquals(0, testPlayer.getLosses());
		
		testPlayer = new Player(4,9);
		
		assertEquals(4, testPlayer.getWins());
		assertEquals(9, testPlayer.getLosses());
		
	}
	
	@Test
	public void settersTest() {
		
		testPlayer = new Player(0, 0);
		
		testPlayer.setWins(1);
		
		assertEquals(1, testPlayer.getWins());
		
		testPlayer.setLosses(1);
		
		assertEquals(1, testPlayer.getLosses());
		
	}
	
	@Test
	public void constructorExceptionTest() {
		
		Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
			
			public void execute() throws Throwable {
				testPlayer = new Player(-2, 5);
				testPlayer = new Player(5, -2);
			}
		});	
	}
}
