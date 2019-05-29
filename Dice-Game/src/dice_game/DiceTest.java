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
	
	@Test
	public void constructorTest() {
		
		testDice = new Dice(6);
		
		assertEquals(6, testDice.getNumberOfSides());
		
		testDice = new Dice(12);
		
		assertEquals(12, testDice.getNumberOfSides());
		
		testDice = new Dice(20);
		
		assertEquals(20, testDice.getNumberOfSides());
		
	}
	
	@Test
	public void constructorExceptionTest() {
		
		Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
			
			public void execute() throws Throwable {
				testDice = new Dice(-6);
				testDice = new Dice(-12);
			}
		});
	}
	
	@Test
	public void rollDiceTest() {
		
		testDice = new Dice(6);
		int testRoll = testDice.rollDice();
		
		assertTrue( testRoll > 0 );
		assertTrue( testRoll <= ( testDice.getNumberOfSides() ) );
		
	}
	
}
