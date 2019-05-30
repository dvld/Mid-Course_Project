package dice_game;

public class Player {

	// properties
	// ====================
	
	private int Wins;
	private int Losses;
	
	// constructor
	// ====================
	
	Player(int wins, int losses) {
		this.Wins = wins;
		this.Losses = losses;
		if(wins < 0 || losses < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	// getters
	// ====================
	
	public int getWins() {
		return Wins;
	}
	
	public int getLosses() {
		return Losses;
	}

	// setters
	// ====================
	
	public Player setWins(int wins) {
		Wins = wins;
		return this;
	}

	public Player setLosses(int losses) {
		Losses = losses;
		return this;
	}
	
}
