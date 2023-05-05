import java.util.*;

public class SinkShipGame {
	private GameHelper helper = new GameHelper();
	private ArrayList<Ship> ships = new ArrayList<Ship>();
	private int numOfGuesses = 0;

	public static void main(String[] args){
		SinkShipGame game = new SinkShipGame();
		game.setUpGame();
		game.startPlaying();
	}

	private void setUpGame() {
		//first make some Ships and give them locations
		Ship s1 = new Ship();
		s1.setName("Cormoranul Jucaus");
		Ship s2 = new Ship();
		s2.setName("Pescarusul Bine-Crescut");
		Ship s3 = new Ship();
		s3.setName("HH Pierre Tristul");

		ships.add(s1);
		ships.add(s2);
		ships.add(s3);

		System.out.println("Your goal is to sink three Ships");
		System.out.println(s1.getName + ", " + s2.getName() + " and " + s3.getName());
		System.out.println("Try to sink them all in the fewest number of guesses.");

		for(Ship s : ships) {
			ArrayList<String> newLocation = helper.placeShip(3);
			s.setLocationCells(newLocation);
		}
	}//setUpGame
		
	private void startPlaying() {
		while(!ships.isEmpty()) {	// <=> while ships list is not empty
			String userGuess = helper.getUserInput("Enter a guess: ");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess){
		numGuesses++;		
		String result = "miss";

		for(Ship s : ships) {
			result = s.checkYourself(userGuess);
			
			if(result.equals("hit")) {
				break;
			}
			if(result.equals("kill")){
				ships.remove(s);
				break;
			}
		}

		System.out.println(result);
	}

	private void finishGame(){
		System.out.println("All ships are on the bottom of the ocean!");
		if(numOfGuesses < 12) {
			System.out.println("It took you only" + numOfGuesses + " guesses.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
		}
	}


}