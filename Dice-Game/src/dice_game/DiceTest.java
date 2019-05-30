package dice_game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Random;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

public class DiceTest {
	
	private Dice testDice;
	
	// ensures constructor properly creates instances of dice object
	@Test
	public void constructorTest() {
		
		testDice = new Dice(6);
		
		assertEquals(6, testDice.getNumberOfSides());
		
		testDice = new Dice(12);
		
		assertEquals(12, testDice.getNumberOfSides());
		
		testDice = new Dice(20);
		
		assertEquals(20, testDice.getNumberOfSides());
		
	}
	
	// handles constructor exception of passing invalid values
	@Test
	public void constructorExceptionTest() {
		
		Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
			
			public void execute() throws Throwable {
				testDice = new Dice(-6);
				testDice = new Dice(-12);
			}
		});
	}
	
	// tests that random number is in range of number of sides of dice object
	@Test
	public void rollDiceTest() {
		
		testDice = new Dice(6);
		int testRoll = testDice.rollDice();
		
		assertTrue( testRoll > 0 );
		assertTrue( testRoll <= ( testDice.getNumberOfSides() ) );
		
	}
	
}
