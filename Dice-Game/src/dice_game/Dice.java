package dice_game;
import java.util.Random;
public class Dice {
	
	// properties
	// ====================
	
	private int Number_Of_Sides;
	
	// constructor
	// ====================
	
	Dice(int number_of_sides) {
		this.Number_Of_Sides = number_of_sides;
		if (number_of_sides < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	// getters
	// ====================
	public int getNumberOfSides() {
		return Number_Of_Sides;
	}
	
	// methods
	// ====================
	
	// generates random number based on the number of sides property of the dice object
	public int rollDice() {
		Random diceRange = new Random();
		int diceResult = diceRange.nextInt(getNumberOfSides()) + 1;
//		System.out.println(diceResult);
		return diceResult;
	}
	
}