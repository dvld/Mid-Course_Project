package dice_game;

import java.util.Scanner;

public class Game {
	static Player player_1 = new Player(0, 0);
		
	static Dice dice_1 = new Dice(6);
	static Dice dice_2 = new Dice(6);
	
	// adds dice rolls
	// ====================
	public static int addDice() {
		int sum = dice_1.rollDice() + dice_2.rollDice();
//		System.out.println("Roll = " + sum);
		return sum;
	}

	public static String playGame(int sum) {
		
		System.out.println("First roll is " + sum);
		
		String message = "";
		if (sum == 7 || sum == 11) {
			player_1.setWins(player_1.getWins() + 1);
//			System.out.println("current wins: " + player.getWins());
			message = "You win current wins: " + player_1.getWins();
			System.out.println(message);
			menu();
		} else if (sum == 2 || sum == 3 || sum == 12) {
			player_1.setLosses(player_1.getLosses() + 1);
//			System.out.println("current losses: " + player.getLosses());
			message = "You lose current losses: " + player_1.getLosses();
			System.out.println(message);
			menu();
		} else {
			int point = sum;
			System.out.println("Point to match is " + point);
			int new_roll = addDice();
			
			while (new_roll != point && new_roll != 7) {
				new_roll = addDice();
				System.out.println("new roll: " + new_roll);
			}
			
			if (new_roll == point) {
				player_1.setWins(player_1.getWins() + 1);
				message = "You win current wins: " + player_1.getWins();
				System.out.println(message);
				menu();
			} else {
				player_1.setLosses(player_1.getLosses() + 1);
				message = "You lose current losses: " + player_1.getLosses();
				System.out.println(message);
				menu();
			}
		}

		return message;
	}
	
	public static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Press '1' to play or '0' to exit");
		int response = input.nextInt(2);
		if (response == 1) {
			playGame(addDice());
		} else {
			System.out.println("Your final scores:");
			System.out.println("Wins: " + player_1.getWins());
			System.out.println("Losses: " + player_1.getLosses());
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		menu();
		
	}
}
